package com.zhj;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 3.根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份");
        int i = s.nextInt();
        switch (i){
            case 3:
            case 4:
            case 5:
                System.out.println("春天-春暖花开 春意盎然-植树 踏青");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天-夏日炎炎  夏雨雨人-游泳  吃雪糕");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天-秋高气爽 一叶知秋 .....");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天-鹅毛大雪 雪兆丰年 滑雪 ");
                break;
            default:
                System.out.println("您输入的月份有误");
        }
    }
}
