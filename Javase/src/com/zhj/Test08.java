package com.zhj;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        //1.根据考试成绩输出对应的礼物，90分以上爸爸给买电脑，80分以上爸爸给买手机， 60分以上爸爸请吃一顿大餐，
        // 60分以下爸爸给买学习资料。
        //要求：该题使用多重if完成
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = s.nextInt();
        if (i>=90&&i<=100){
            System.out.println("买电脑");
        }else if (i>=80 && i<90){
            System.out.println("买手机");
        }else if (i>=60 && i<80){
            System.out.println("请吃一顿大餐");
        }else if (i<60 && i>=0){
            System.out.println("买学习资料");
        }else if (i>100||i<0){
            System.out.println("你输入的成绩不存在");
        }
    }
}
