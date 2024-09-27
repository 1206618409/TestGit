package io_demo.oo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 14:00
 **/
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;
        bos = new ByteArrayOutputStream();
        bos.write(123);
        byte[]bytes = new byte[1024];
        try {
            bos.write("http：//www.baidu.com".getBytes());
            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


