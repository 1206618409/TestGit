package NetDemo.com.ccc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 18:27
 **/
public class PicClient {
    public static void main(String[] args) throws IOException {
        //创建文件输入流对象
        FileInputStream fileInputStream = new FileInputStream("1.jpg");
        Socket socket = new Socket("localhost",220);
        OutputStream outputStream = socket.getOutputStream();
        int len = 0;
        while((len = fileInputStream.read())!=-1){
            outputStream.write(len);
        }
        System.out.println("接收服务端的相应");
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[]bytes = new byte[1024];

        int leng = inputStream.read(bytes);
        System.out.println(new String(bytes,0,leng));
        socket.shutdownInput();
        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        socket.close();
    }
}


