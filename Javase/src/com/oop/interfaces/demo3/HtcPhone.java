package com.oop.interfaces.demo3;

public class HtcPhone extends Phone implements Cc{
    @Override
    public void wenzi() {
        System.out.println("发送带图片与文字信息");
    }

    @Override
    public void yuyin() {
        System.out.println("开始视频通话");
    }

    @Override
    public void music() {
        System.out.println("开始播放视频《小时代》......");
    }

    @Override
    public void yidong() {
        System.out.println("已经启动移动网络");
    }

    @Override
    public void paizhao() {
        System.out.println("咔嚓....拍照成功");
    }
    public HtcPhone(){
        System.out.println("这是一款型号为HTC的I9100手机：");
    }
}
