package com.zhj;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        //1.输入自己的名字，年龄和性别，分别用不同的变量接收，并将输入的信息做输出。
        /*Scanner s = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String s1 = s.nextLine();
        System.out.println("请输入你的年龄");
        int s2 = s.nextInt();
        System.out.println("请输入你的性别");
        String s3 = s.next();
        System.out.println("名字叫"+s1);
        System.out.println("年龄"+s2);
        System.out.println("性别"+s3);

         */
        //2.输入圆形半径，求圆形的周长和圆形的面积,并将结果输出。
        /*final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆形的半径");
        float r = in.nextFloat();
        double c = 2 * PI * r;
        double s = PI * r * r;
        System.out.println("该圆的半径为：R=" + r);
        System.out.println("该圆的周长为：C=" + 2 + "*" + PI + "*" + r + "=" + c);
        System.out.println("该圆的面积为：S=" + PI + "*" + r + "*" + r + "=" + s);
        */
       // 3.银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
        //结果如下图所示。（结果四舍五入，不保留小数位。使用Math.round(double d)实现）

        /*
        int m = 10000;
        System.out.println("本金:"+m);
        double d1 = m*(1+0.35/100);
        System.out.println("活期一年的存款是"+ Math.round(d1));
        double d2 =  m*(1+1.50/100);
        System.out.println("活期两年的存款是："+Math.round(d2));
        double d3 = m*(1+0.35/100*2);
        System.out.println("定期一年:"+Math.round(d3));
        double d4 = m*(1+2.10/100*2);
        System.out.println("定期两年："+Math.round(d4));
        */
        //4.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,
        // 然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
        //输入一个4位整数
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个4位正整数：");
        int num = s.nextInt();
        //获取千位上的数字
        int b4 = num/1000;
        //获取百位上的数字
        int b3 = (num/100)%10;
        //获取十位上的数字
        int b2 = (num/10)%10;
        int b1 = (num%10);
        b4 = (b4+5)%10;
        b3 = (b3+5)%10;
        b2 = (b2+5)%10;
        b1 = (b1+5)%10;
        int temp;
        temp = b4;
        b4 = b1;
        b1 = temp;
        temp = b2;
        b2 = b3;
        b3 = temp;
        // 输出加密后数字
        //System.out.println("加密后的数字为："+bit4+bit3+bit2+bit1);
        int ennum = b4*1000+b3*100+b2*10+b1;
        System.out.println("加密后的数字为："+ennum);

         */
        /*
        * 利用”异或”运算的性质,对几个字符进行加密并输出密文,然后再解密。加密算法是：密钥是字符’8’，
        * 明文的每个字符和密钥进行异或运算，得到密文。密钥和密文的每个字符再次进行异或运算，重新得到明文。
        * 结果如图所示*/
        char a = '十',b = '点',c= '进',d= '攻';
        char s = '8';
        a = (char)(a^s);
        b = (char)(b^s);
        c = (char)(c^s);
        d = (char)(d^s);
        System.out.println("密文"+a+b+c+d);
        a = (char)(a^s);
        b = (char)(b^s);
        c = (char)(c^s);
        d = (char)(d^s);
        System.out.println("解密后原文"+a+b+c+d);
        for (int i = 0; i <10 ; i++) {
            int m = (int)Math.round(1)+30;
            System.out.println(m);
        }

    }

}
