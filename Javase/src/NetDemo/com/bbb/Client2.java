package NetDemo.com.bbb;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 15:53
 **/
public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",100);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("helloworld".getBytes());

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        InputStream inputStream = socket.getInputStream();
        byte[]bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("服务器端的相应数据是"+new String(bytes,0,len));
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}


