package com.oop.interfaces.demo1;

/**
 * java中的继承关系是单继承，如果拥有多个父类的时候，可以考虑使用接口进行实现
 *      java中的接口具备广泛的使用：
 *      用法：
 *          1、使用 Interface来修饰
 *          2、接口中可以包含多个方法，且方法跟抽象类中的抽象方法一致，可以不写实现,子类在实现的时候必须要实现代码逻辑
 *          3、子类实现接口使用implements关键字
 *          接口特征:
 *             1、接口中的所有方法
 */
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor ld = new LockDoor();
        ld.openDoor();
        ld.openLock();
        ld.closeDoor();
        ld.closeLock();
    }
}
