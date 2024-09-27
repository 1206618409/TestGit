package io_demo.CharArray;

import java.io.CharArrayWriter;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 18:55
 **/
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        charArrayWriter.write(100);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}


