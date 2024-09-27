package com.zhj;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        //6.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个十进制数字");
        int number = ss.nextInt();
        String s = "";
        while (number!=0){
            int i = number % 2;
            s = i + s;
            number = number/2;
        }
        System.out.println(s);

    }
}
