package com.oop.polymorphism;

/**
 * 多态
 * 多态:对应同一个指令（调用同一个名称的方法），不同的对象给予不同的反应（不同的方法实现）
 *
         * 规范:
         * 1、必须要有继承关系
         * 2、子类方法必须重写父类的方法
         * 3、父类引用指向子类对象
 *  类型转换：
 *          向上转型——自类转换为父类，自动进行类型转换
 *          乡下转型——父类转换为子类，结合instanceof运算符进行强制类型转换
 * 多态目的：
 *      为了提高代码的扩展性和维护性
 *      方便代码逻辑的编写
 * 多态的两种表现形式
 *        1、父类作为方法的参数
 *        2、父类作为方法的返回值类型
 * 引用类型的转换跟基本数据类型的转换类似：
          1、当父类需要转成子类的时候，要进行强制转换，但是在强制转换之前一定要先判断父类引用指向的子类对象到底是谁，
             如果无法确定，在运行过程中可以出错
          2、当子类需要向父类转换的时候，直接自动转换，不需要进行任何的判断。
 */
public class Person {
    public void feed(Pet p){
        p.feed();
    }
    public void play(Pet p) {
        p.play();
    }
    public Pet buyPet(int type){
        if (type==1){
            return new Dog();
        }else if (type==2){
            return new Cat();
        }else {
            return new Penguin();
        }
    }
    public static void main(String[] args) {
        Person p = new Person();
        Pet pet1 = new Dog();
        Pet pet2 = new Cat();
        Pet pet3 = new Penguin();
        p.feed(pet1);
        p.feed(pet2);
        p.feed(pet3);
        p.play(pet1);
        p.play(pet2);
        p.play(pet3);
        Pet pet = p.buyPet(2);
        if (pet instanceof Dog){
            System.out.println("买的是一只狗");
        }else if (pet instanceof Cat){
            System.out.println("买的是一只猫");
        }else{
            System.out.println("买的是一只企鹅");
        }
        p.buyPet(3);
    }
}
