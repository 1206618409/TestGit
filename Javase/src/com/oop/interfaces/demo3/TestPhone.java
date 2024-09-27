package com.oop.interfaces.demo3;

/**
         * 抽象类和接口的区别：
         * 1、抽象类中的方法可以有抽象方法，也可以有普通方法，但是接口中只能包含抽象方法
         * 2、抽象类需要使用abstract关键字来修饰，而接口使用interface关键字来修饰
         * 3、子类使用extends关键字来继承抽象类，使用implements来实现接接口
         * 4、子类继承抽象类的时候必须要实现所有的抽象方法，普通方法可以不重写，而接口中的所有方法必须实现
         * 5、抽象类中可以定义成员变量，而接口中只能定义静态常量
         * 6、抽闲类在子类实现的时候单继承，而接口是多继承
         * 7、抽象类和接口都不能实例化，但是抽象类中可以有构造方法，而接口中不能有构造方法
         * 8、抽象类中可以实现接口，并且要实现接口中方法，而接口只能继承接口，不能实现接口
         * 注意：
 *      在实际的项目开发中，如果可以使用接口，尽量使用接口，将单继承的父类留在最关键的地方
 */
public class TestPhone {
    public static void main(String[] args) {
        OoPhone o = new OoPhone();
        o.music();
        o.wenzi();
        o.yuyin();
        System.out.println("----------------------");
        HtcPhone hp = new HtcPhone();
        hp.yidong();
        hp.music();
        hp.paizhao();
        hp.wenzi();
        hp.yuyin();
    }
}
