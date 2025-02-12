package Colletctions.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *      三种循环
 *          dow.......hile
 *          while
 *          for
 *          还有一种增强for循环方式，可以简化
 *          所有的集合类都默认实现了Iteratable接口，实现此接口意味着具备了增强for循环的能力，也就是 for-each
 *          增强for循环本质上使用但也是iterator的功能
 *          方法：
 *              Iterator（）
 *              foreach（）
 *       在Iterator的方法中，要求返回一个Iterator接口子类的实现对象
 *          此接口中包含了
 *          hasNext（）
 *          next（）
 *       在使用iterator进行迭代的过程中如果删除其中的某个元素会报错，并发操作异常，因此
 *       如果遍历的同时需要修改元素，建议使用listIterator（）
 *       ListIterator迭代器提供了向前和向后两种遍历方式
 *       始终是通过cursor和lastret的指针来获取元素值及向下的遍历索引
 *       当使用向前遍历的时候必须要保证指针在迭代器的结果，否则无法获取结果值
 *
 *          */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        //使用迭代器
        //Iterator iterator = list.iterator();
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            if (o.equals(1)){
                iterator.remove();
            }
            System.out.println(o);
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("-------------------------------");
//        for (Object i : list) {
//            System.out.println(i);
//        }

    }
}
