package io_demo.cc;/**
 * @author zhj
 * @create 2019-11-06 12:21
 **/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description @ZHJ
 * @author ZHJ
 * @create 2019-11-06 12:21
 **/
public class InputStreamRederDemo {
    public static void main(String[] args) {
        File f = new File("abc.txt");
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream(f);
            isr = new InputStreamReader(fis,"utf-8");
            char[]c = new char[1024];
            int len = isr.read(c);
            System.out.println(new String(c,0,len));
           /* int len = 0;
            while((len=isr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


