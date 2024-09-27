package NetDemo.com.aaa;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 15:41
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        //客户端
        Socket socket = new Socket("localhost",10086);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("Hello,你好");
        dataOutputStream.close();
        socket.close();
    }

}


