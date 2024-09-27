package com.oop.Inner;

public class StaticInner {
    private String name;
    private int age;
    public void show(){
        System.out.println("show");
    }
    static class InnerClass{
        public void show(){
            System.out.println("show....");
        }
    }

    public static void main(String[] args) {
        StaticInner.InnerClass in = new StaticInner.InnerClass();

    }
}
