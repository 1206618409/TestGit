package com.oop.Inner;

public class TestDemo {
    private int id;
    private String name;
    private int age;

    public void show(){
        System.out.println("show");
        new InnerClass().test();
    }
    class InnerClass{
        private int age;

        public void test(){
            System.out.println("test");
            System.out.println(id);
            System.out.println(age);
            System.out.println(name);

            class A{
                int show(int a){
                    System.out.println(a);
                    return a;
                }
            }
             int c = new A().show(5);
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

    public void setAge(int age) {
        this.age = age;
    }
}
