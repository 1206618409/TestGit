package com.zhj;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //2.根据成绩输出对应的等级，使用if多分支和switch语句分别实现。
        //a)A级   [90,100]
        //b)B级   [80,90)
        //c)C级   [70,80)
        //d)D级   [60,70)
        //e)E级   [0,60)
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字代表你的成绩");
        int i = s.nextInt();
        String s2;
        /*if (90<=i && i<=100){
          s2 = "A";
        }else if (80<=i && i<90){
            s2 = "B";
        }else if (70<=i && i<80){
               s2 = "C";
        }else if (60<=i && i<70){
              s2 = "D";
        }else if (0<=i && i<60){
             s2 = "E";
        }else if (0<i && i>100){
            System.out.println("你输入的成绩不存在");
        }
        System.out.println("i=" + i + ",s2=" + s2);

         */

        switch (i/10){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                s2 = "E";
               break;
            case 6:
                s2 = "D";
                break;
            case 7:
                s2 = "C";
                break;
            case 8:
                s2 = "B";
                break;
            case 9:
            case 10:
                if (!(i>100)){
                    s2 = "A";
                    break;
                }
            default:
                s2 = "不存在";

        }
        System.out.println("i=" + i + ",s2="+s2 );
    }
}
