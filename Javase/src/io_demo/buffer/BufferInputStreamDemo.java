package io_demo.buffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 14:49
 **/
public class BufferInputStreamDemo {
    public static void main(String[] args) {
        File f = new File("abc.txt");
        FileInputStream file = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            file = new FileInputStream(f);
            bufferedInputStream = new BufferedInputStream(file);
            int len = 0;
            while((len = bufferedInputStream.read())!=-1){
                //bufferedInputStream.skip(10);
                System.out.print((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


