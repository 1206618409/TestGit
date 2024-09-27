package com.zhj;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char c,h;
        String str = "";
        System.out.println("please enter the first letter:");
        str = s.next().toLowerCase();
        c = str.charAt(0);
        switch(c){
            case 'm':
                System.out.println("Monday"+"\t");
                break;
            case 'w':
                System.out.println("Wednesday"+"\t");
                break;
            case 'f':
                System.out.println("Friday"+"\t");
                break;
            case 't':
                System.out.println("please enter the next letter:");
                str = s.next().toLowerCase();
                h = str.charAt(0);
                if (h == 'u')
                    System.out.println("Tuesday\n");
                else if (h == 'h')
                    System.out.println("Thursday\n");
                else
                    System.out.println("error\n");
                break;
            case 's':
                System.out.println("please enter the next letter:");
                // 转换成字符串
                str = s.next().toLowerCase();
                h = str.charAt(0);
                if (h == 'a')
                    System.out.println("Saturday\n");
                else if (h == 'u')
                    System.out.println("Sunday\n");
                else
                    System.out.println("error\n");
                break;
            default:
                System.out.println("error\n");
                break;

        }

    }
}
