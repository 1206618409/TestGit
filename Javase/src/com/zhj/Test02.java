package com.zhj;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //1.输入一个数，判断是奇数还是偶数
        Scanner s = new Scanner(System.in);
        System.out.println("输入一个数字");
        int i = s.nextInt();
        if (i%2==0){
            System.out.println(i+"输入的数字是偶数");
        }else{
            System.out.println(i+"输入的数字是奇数");
        }
    }
}
