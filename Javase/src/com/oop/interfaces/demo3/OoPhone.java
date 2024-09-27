package com.oop.interfaces.demo3;

public class OoPhone extends Phone {
    @Override
    public void wenzi() {
        System.out.println("发送文字信息.....");
    }

    @Override
    public void yuyin() {
        System.out.println("开始语音通话.....");
    }

    @Override
    public void music() {
        System.out.println("开始播放音乐《热雷》.......");
    }
    public OoPhone(){
        System.out.println("这是一款 型号为G502c索尼爱立信手机：");
    }
}
