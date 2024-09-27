package NetDemo.com.bbb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 18:06
 **/
public class Server2 {
    public static void main(String[] args) throws IOException {
        //创建ServerSock对象
        ServerSocket serverSocket = new ServerSocket(100);
        Socket server = serverSocket.accept();
        InputStream inputStream = server.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("客户端传输的数据是"+new String(bytes,0,len));
        //-----------------------------------------------------
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("你好收到，".getBytes());
        //关闭
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }
}


