package com.oop.extend;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",20);
        s2.setName("lisi");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((Student)o).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
