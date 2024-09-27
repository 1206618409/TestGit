package com.zhj;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //5.从键盘输入一个班5个学生的分数，求和并输出。
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("请输入第"+i+"个学生的成绩");
            int s1 = s.nextInt();
            sum += s1;
        }


        System.out.println("5个人的成绩是"+sum);
    }
}
