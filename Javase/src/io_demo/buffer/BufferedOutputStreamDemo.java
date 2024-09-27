package io_demo.buffer;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 15:01
 **/
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        File f = new File("123.txt");

        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f,true);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //bufferedOutputStream.write(98);
            bufferedOutputStream.write("http://www.baidu.com".getBytes());
            bufferedOutputStream.write("\r\n".getBytes());
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}


