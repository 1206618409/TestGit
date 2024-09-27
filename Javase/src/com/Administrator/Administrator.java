package com.Administrator;

import java.util.Scanner;

public class Administrator {

    String name = "admin";
    String password = "123456";
    void load(){
        System.out.println(name);
        System.out.println(password);
    }
    public static void main(String[] args) {
            Administrator a1 = new Administrator();

            System.out.println(a1.name);
            System.out.println(a1.password);
            a1.load();
            System.out.println("修改密码");
            while(true){
                System.out.println("请输入用户名称");
                Scanner san = new Scanner(System.in);
                String name1 = san.nextLine();
                System.out.println("请输入用户密码");
                String psd1 = san.nextLine();
                if (name1.equals(a1.name) && psd1.equals(a1.password)) {
                    System.out.println("请输入用户名称");
                    a1.name = san.nextLine();
                    System.out.println("请输入用户密码");
                    a1.password = san.nextLine();
                    System.out.println("修改成功");
                    break;
                }else{
                    System.out.println("用户名和密码不正确，请重新输入");
                }
            }
            a1.load();

    }
}
