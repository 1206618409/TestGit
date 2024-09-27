package Colletctions.coll;

import java.util.Vector;

/**
     * 1、Vector也是List接口的一个子类实现
     * 2、Vector跟ArrayList一样，底层都是使用数组进行实现的
     * 3 区别：
     * （1）ArrayList是线程不安全的，效率高Vector是线程安全的效率低
     *  （2）ArrayList在进行扩容的时候，是扩容1.5倍，Vector扩容的时候扩容原来两倍
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add("abc");
        System.out.println(vector);
    }
}
