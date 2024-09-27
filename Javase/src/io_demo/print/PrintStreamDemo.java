package io_demo.print;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 9:54
 **/
public class PrintStreamDemo {
    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("123.txt"));
            printStream.write("www.baidu.com".getBytes());
            System.out.println();
            printStream.print(true);
            //格式化输出 %s  字符串%d：整数  %f：浮点数
            System.out.printf("%s--%d---%.2f","abc",123,111.1111);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();

    }
}


