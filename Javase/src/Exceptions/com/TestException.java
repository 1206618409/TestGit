package Exceptions.com;

import java.io.File;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入被除数");
        int i = s.nextInt();
        if (i>0 && i<=100){
            System.out.println("请输入除数");
            int j = s.nextInt();
            if (j!=0){
                System.out.println(String.format("%d / %d = %d",i,j,i/j));
            }else {
                System.out.println("除数不能等于0");
            }
        }else {
            System.out.println("输入的参数有问题");
        }
        System.out.println("欢迎使用本程序");

    }
}
