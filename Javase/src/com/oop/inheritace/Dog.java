package com.oop.inheritace;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        if (age>0){
            this.age = age;
        }else{
            System.out.println("输入年龄不规范");
        }
        this.color = color;
    }

    public Dog() {
    }

    public void show(){
        System.out.println("姓名:"+this.name);
        System.out.println("年龄:"+this.age);
        System.out.println("颜色:"+this.color);
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }else{
            System.out.println("输入年龄不规范");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
