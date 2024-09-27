package io_demo.writer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputDemo {
    public static void main(String[] args) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream("abc.txt");
            fos = new FileOutputStream("aaa.txt");
            int len = 0;
            byte[] b = new byte[1024];
           while((len = fis.read(b))!=-1){
               fos.write(b);
               fos.flush();
           }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
