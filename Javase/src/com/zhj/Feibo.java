package com.zhj;

public class Feibo {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {

            System.out.print(getM(i)+ "\t");
        }
    }

    public static int getM(int m) {
        if (m == 1 || m == 2) {
            return 1;
        }else {
            return getM(m-1) + getM(m-2);
        }
    }
}
