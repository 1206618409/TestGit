package com.oop.extend;

public class Dog extends Pet{
//    private String name;
//    private int age;
//    private String gender;
    private String sound;

    public Dog() {
    }

    public Dog(String name, int age, String gender, String sound) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        super(name,age,gender);
        this.sound = sound;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public void play(){
        System.out.println("dog...play");
        super.play();
    }
}
