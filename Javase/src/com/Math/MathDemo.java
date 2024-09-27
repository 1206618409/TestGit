package com.Math;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.ceil(-11.9));
        System.out.println(Math.floor(-5.01));
        System.out.println(Math.pow(2,3));
        System.out.print(Math.round(-5.5)+" ");
        int num = 0;
        for (int i = 0; i < 50; i++) {
            int h = ((int) (61 * Math.random()));
            System.out.println(h);
        }

    }
}
