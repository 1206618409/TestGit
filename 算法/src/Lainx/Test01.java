package src.Lainx;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
       /* int max = 0;
        int min = 0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                max+=i;
            }else {
                min+=i;
            }

        }
        System.out.println(max);
        System.out.println(min);
        int n = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t ");
                n++;
            }
            if (n>=3){
                System.out.println();
                n=0;
            }
        }*/
        /*Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x = s.nextInt();

        String c = "";
        while(x!=0){
            int m = x % 2;
            c = m + c;
            x = x/2;
        }
        System.out.println(c);
*/
        for (int i = 0; i <=20 ; i++) {
            for (int j = 0;j<34;j++){
                for (int k = 0;k<=300;k++){
                    if (i+j+k==100 && (5*i+3*j+k/3 ==100) && k%3==0 &&i>0&& j>0 &&k>0){
                        System.out.println("公鸡："+i+"\t"+"母鸡:"+j+"\t"+"小鸡："+k);
                    }
                }

            }
        }



    }
}
