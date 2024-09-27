package io_demo.CharArray;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 17:56
 **/
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        char[]c = new char[1024];
        //char[] chars = "先帝创业未半而中道崩殂".toCharArray();
        char[]cs = {'先','帝','创','业','未','半','而','中','道','崩','殂'};
        CharArrayReader charArrayReader = new CharArrayReader(c);
        try {
            int len = charArrayReader.read(cs, 3, 6);
            System.out.println(new String(cs,0,len));


        } catch (IOException e) {
                e.printStackTrace();
        }finally {
            charArrayReader.close();
        }



    }
}


