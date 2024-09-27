package src;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[]userBox = {"艾斯","萨博","路飞"};
        int[]passwordBox = {123,456,789};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入账号");
        String user = scan.nextLine();
        System.out.println("请输入密码");
        int password = scan.nextInt();
        boolean b = false;
        for (int i = 0; i <userBox.length ; i++) {
            if (userBox[i].equals(user)){
                if (passwordBox[i]==password){
                    System.out.println("登录成功");
                    b = true;
                }
                break;
            }
        }
        if (!b){
            System.out.println("用户名或密码错误");
        }
    }
}
