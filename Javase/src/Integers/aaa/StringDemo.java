package Integers.aaa;

public class StringDemo {
    public static void main(String[] args) {
        /*
               1、常量池在1.7之后放置在了堆空间之中
               字符串的使用：
               1、创建
               String str = "abc";
               String str2 = new String("abc");
               两种方式都可以用，只不过第一种比较多

         */
        String str = "abc";
        String str2 = new String("abc");
        str2 = str2.intern();
        System.out.println(str==str2);//true
        System.out.println(str2.equals(str2));//true
        System.out.println(str.charAt(0));//a
        //数组的复制过程
        System.out.println(str.concat("aaa"));//abcaaa
        //返回指定下标的元素
        System.out.println(str.indexOf("a"));//0
        String s = "abcdefghijklmn";
        System.out.println(s.substring(3));//defghijklmn
        //在截取字符字符串的时候，西药注意的是    左闭右开区间
        System.out.println(s.substring(3,5));//de
        System.out.println(s.length());//14

        String s1 = "a"+"b"+"c";
        String s2 ="abc";
        System.out.println(s1==s2);
    }
}
