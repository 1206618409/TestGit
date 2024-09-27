package Integers.aaa.Strings;

/**
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append(1).append(1.234).append("abc").append("true");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(1.234).append("abc").append("false");
        System.out.println(sb);
    }
}
