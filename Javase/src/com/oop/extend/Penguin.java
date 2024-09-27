package com.oop.extend;

public class Penguin extends Pet{
//    private String name;
//    private int age;
//    private String gender;
    private String color;

    public Penguin() {

    }

    public Penguin(String name, int age, String gender, String color) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void play(){
        System.out.println("...play");
    }
}
