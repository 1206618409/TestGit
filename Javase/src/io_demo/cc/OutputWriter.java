package io_demo.cc;/**
 * @author zhj
 * @create 2019-11-06 11:58
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @description @ZHJ
 * @author ZHJ
 * @create 2019-11-06 11:58
 **/
public class OutputWriter {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;
        File f = new File("abc.txt");
        try {
            long start = System.currentTimeMillis();
            fos = new FileOutputStream(f);
            osw = new OutputStreamWriter(fos,"gbk");
            osw.write("哈哈");
            osw.write("abcdefg",0,5);
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                osw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


