package NetDemo.com.ddd;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 19:25
 **/
public class LoginServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(1200);
        while(true){
            Socket socket = serverSocket.accept();
            //获取输入流对象
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            User user = (User) objectInputStream.readObject();
            String s = "";

            if ("haha".equals(user.getUsername())&& "haha".equals(user.getPassword())){
                System.out.println("欢迎您"+user.getUsername());
                s = "登录成功";
            }else{
                s = "登录失败";
            }
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(s);

            //关闭流
            socket.shutdownOutput();
            dataOutputStream.close();
            inputStream.close();
            objectInputStream.close();
            socket.close();
        }

        //serverSocket.close();

    }
}


