package io_demo.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo2 {
    public static void main(String[] args){
        Reader r = null;
        try {
             r = new FileReader("abc.txt");
             int len = 0;
             char[]c = new char[1024];
             while((len=r.read(c))!=-1){
                 System.out.println(new String(c,0,len));
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
