package com.zhj;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        //3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。

        Scanner s = new Scanner(System.in);
        int max = 0, min = 0;
        int nums = 1;
        //输入第一个数，指定它是最大值和最小值
        System.out.println("请输入1个数：");
        nums = s.nextInt();
        max = nums;
        min = nums;
        //依次输入其他数字，并判断是否是最大值和最小值
        for (int i = 2; nums != 0; i++) {
            System.out.println("请输入" +i + "个数：");
            nums = s.nextInt();
            if (nums != 0) {
                if (nums > max) {
                    max = nums;
                }
                if (nums < min) {
                    min = nums;
                }
            }
        }
        //输出最大值和最小值
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);



    }
}
