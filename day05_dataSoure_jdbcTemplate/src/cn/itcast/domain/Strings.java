package cn.itcast.domain;

public class Strings {
    public static void main(String[] args) {
        String str = "and";
        StringBuilder builder = new StringBuilder(str);
        builder.append(str);
        int length1 = builder.length();

        System.out.println(length1);
    }
}
