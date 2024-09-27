package com.oop.interfaces.demo2;


public class Mouse implements Usb {
    @Override
    public void data() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("鼠标在自己玩");
    }
}
