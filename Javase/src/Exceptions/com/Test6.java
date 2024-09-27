package Exceptions.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("请输入1-3之间的数字");
            int i = s.nextInt();
            if (i==1){
                System.out.println("语文");
            }else if (i==2){
                System.out.println("数学");
            }else if (i==3){
                System.out.println("英语");
            }else {
                System.out.println("输入错误");
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }

    }
}
