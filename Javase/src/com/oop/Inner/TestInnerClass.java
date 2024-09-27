package com.oop.Inner;

/**
     * 内部类：（当做类中的普通成员变量，只不过此成员变量是class类型）
     * 一个java文件中可以包含多个class，但是只能有一个public class
     * 如果一个类定义在另一个类的内部，此时可以称之为内部类
     * 作用：
     * 创建内部类的时候，跟之前的方法不一样，需要在内部类的前面添加外部类来进行修饰
     * TestDemo.InnerClass ti = new TestDemo().new InnerClass();
     * 1、内部类可以方便的访问外部类的私有属性
     * 2、但是外部类不能访问内部类的私有属性，但是如果创建了内部类的对象此时可以在外部类中访问私有属性
     * 3、内部类中的不能定义静态属性
     * 4、当内部类和外部类具有相同的私有属性的时候，在内部类中访问的时候，可以直接访问内部类的属性， 如果需要访问外类的属性，
 *      那么需要添加 外部类类名.this.属性
     *
     *
     * 分类：
     * 匿名内部类：当定义了一个类，实现了某个接口，在使用过程中只需要使用一次，没有其他用途
     * 其实考虑到代码编写的简介，可以考虑不创建具体的类，而采用new interface（）添加实现的方法 就叫做匿名内部类
 *
 *
     *  静态内部类：
     * 在内部类中可以定义静态内部类，使用static 关键字进行修饰，使用规则
     * 外部类名.内部类名 类的引用 = new 外部类名.内部类（）；
 */

public class TestInnerClass {
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        td.show();

//        TestDemo.InnerClass ti = new TestDemo().new InnerClass();
//        ti.test();

    }
}
