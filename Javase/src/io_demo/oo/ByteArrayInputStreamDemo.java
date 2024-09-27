package io_demo.oo;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @description @ZHJ
 * @author ZHJ
 * @create 2019-11-06 13:37
 **/
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String str = "1234567890";
        byte[] bytes = str.getBytes();
        ByteArrayInputStream bais = null;
        bais = new ByteArrayInputStream(bytes);
        int len = 0;
        while((len=bais.read())!=-1){
            bais.skip(2);
            System.out.println((char)len);
        }
        try {
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


