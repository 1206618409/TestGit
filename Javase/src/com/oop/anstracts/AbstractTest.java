package com.oop.anstracts;

/**
 *  抽象类：
 *       1、创建抽象类的时候需要添加abstract的关键字
 *       2、不能进行实例化，也就是不能new 对象
 *       3、抽象类中的某些方法需要子类进行更丰富实现，父类实现没有意义，此时可以将抽象类中的方法定义为抽象方法。
 *       没有具体的实现，只包含方法名称，返回值，参数列表，访问修饰符
 *       4、使用abstract关键字修饰的方法叫做抽象方法，可以不写方法实现
 *       5、子类在进行抽象父类的时候，必须将父类中的抽象方法进行实现或者将子类也定义为抽象类
 *
 *
 *       final表示最终的意思
              final的使用：
                  final 可以修饰变量
                        表示变量的值不可变
                  final可以修饰方法:
                        表示方法不可以被重写
                  final 可以修饰类:
                        表示类不可以被继承
 */
public class AbstractTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
        d.play();
    }


}


