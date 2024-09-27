package NetDemo.com.aaa;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 15:47
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket server = serverSocket.accept();
        InputStream inputStream = server.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);

        dataInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }
}


