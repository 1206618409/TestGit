package NetDemo.com.eee;

import NetDemo.com.ddd.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 8:27
 **/
public class ThreadServer implements Runnable {
    private Socket socket;

    public ThreadServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {

            objectInputStream = new ObjectInputStream(socket.getInputStream());
            NetDemo.com.ddd.User user = (User)objectInputStream.readObject();
            String str = "";
            if ("haha".equals(user.getUsername())&& "haha".equals(user.getPassword())){
                System.out.println("欢迎您"+user.getUsername());
                str = "登录成功";
            }else{
                str = "登录失败";
            }
            socket.shutdownInput();
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);
            socket.shutdownOutput();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}


