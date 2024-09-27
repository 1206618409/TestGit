package Exceptions.com;

import java.util.Scanner;

public class TESTException2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入被除数");
        try {
            int i = s.nextInt();
            System.out.println("请输入除数");
            int j = s.nextInt();
            System.out.println(String.format("%d / %d = %d",i,j,i/j));
            System.out.println("前面没有异常");
        }catch (Exception e){
            System.out.println("出现异常了");
             e.printStackTrace();
            //System.out.println(e.getMessage());  比较少
        }

        System.out.println("欢迎使用本程序");

    }
}
