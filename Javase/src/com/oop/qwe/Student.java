package com.oop.qwe;

public class Student {
    int stuNumber;
    String name;
    int age = 20;


    void study(){
        System.out.println("学习");
    }


    void eat(String food){
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.stuNumber);
        stu.study();
        stu.eat("apple");

        stu.name = "hah";
        stu.stuNumber = 616116;
        stu.age = 15;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.stuNumber);
    }

}
