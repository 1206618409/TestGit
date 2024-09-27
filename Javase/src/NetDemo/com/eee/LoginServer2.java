package NetDemo.com.eee;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 8:42
 **/
public class LoginServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1200);
        while(true){
            Socket socket = serverSocket.accept();
            ThreadServer threadServer = new ThreadServer(socket);
            new Thread(threadServer).start();

        }
    }
}


