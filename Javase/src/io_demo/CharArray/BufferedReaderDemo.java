package io_demo.CharArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 19:27
 **/
public class BufferedReaderDemo {
    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("aaa.txt"));
            String read = null;
            while((read=reader.readLine())!=null){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


