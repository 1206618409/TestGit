package NetDemo.com.ccc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 18:27
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(220);
        Socket socket = serverSocket.accept();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("xiaodao.jpg");
        int len = 0;
        while ((len = inputStream.read())!=-1){
            fileOutputStream.write(len);
        }
        socket.shutdownInput();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("上传成功".getBytes());

        socket.shutdownOutput();
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}


