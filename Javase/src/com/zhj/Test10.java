package com.zhj;

public class Test10 {
    public static void main(String[] args) {
        //给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，问最多可以喝到多少瓶可乐。
        int m = 20;
        int p = 3;
        int t = 0;
        int c = 0;
        int sum = 0;
        while(m>=p){
            t = m/p;
            sum+=t;
            c = m%p;
            m = t+c;
        }
        System.out.println(sum);
    }
}
