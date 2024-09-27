package NetDemo.com.ddd;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 19:21
 **/
public class LoginClient {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream =null;
        ObjectOutputStream objectOutputStream = null;
        DataInputStream dataInputStream = null;
        Socket socket = null;
        boolean a = true;
        while(a) {
             socket = new Socket("localhost", 1200);
            outputStream = socket.getOutputStream();
            User user = getUser();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);
            //调用shutdown方法高速对方传输完成
            socket.shutdownOutput();
            //接收相应
             dataInputStream = new DataInputStream(socket.getInputStream());
            String s = dataInputStream.readUTF();
            System.out.println(s);
            if (s=="登陆成功"){
                dataInputStream.close();
                objectOutputStream.close();
                outputStream.close();
                socket.close();
                a = false;
                break;
            }

        }
        //关闭流


    }
    public static User getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        return new User(username,password);
    }
}


