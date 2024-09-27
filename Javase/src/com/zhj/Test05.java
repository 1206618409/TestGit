package com.zhj;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //4.判断一个数是否是素数。
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int m = s.nextInt();
        boolean b = false;//用来记录标记
        if (m==1){
            b = false;
        }
            for (int i = 2; i < m / 2; i++) {
                if (m % i == 0) {
                    System.out.println(m+"不是素数");
                    b = true;
                    break;
                }
            }
        if (!b){
            System.out.println(m+"是素数");
        }


    }
}
