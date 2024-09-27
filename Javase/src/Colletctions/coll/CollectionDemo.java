package Colletctions.coll;

import java.util.ArrayList;
import java.util.Collection;

/**
         * api方法：
         * 添加数据的方法：
         * add：要求必须传入的参数是Object对象，因此当写入基本数据类型的时候，包含了自动拆箱和自动装箱的过程
         * addAll：添加另一个集合到此集合中
 *
         * 删除数据的方法
         * clear：只是清空集合中的元素，但是此集合对象并没有被回收
         * remove：删除指定元素
         * contains：判断集合中是否包含指定的元素值
         * containsAll：判断此集合是否包含另一个集合
         *
         * 查询数据的方法：
         * isEmpty:判断集合是否等于空
         * retainAll:若集合中拥有另一个集合的所有元素，返回true，否者返回false
         * size：返回当前集合的大小
         * 集合转数组的操作
         * toArray：将集合转换成数组
         * Collection：存放的是单一值
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);
        ((ArrayList)collection).add(0,"coo");
        System.out.println(collection);
        System.out.println("---------------");
        Collection collection2 = new ArrayList();
        collection2.add("a");
        collection2.add("b");
        collection2.add("c");
        collection2.add("d");
        collection.addAll(collection2);
        System.out.println(collection);
        //collection.clear();//clear：只是清空集合中的元素，但是此集合对象并没有被回收
        //System.out.println(collection);
        System.out.println(collection.contains("a")); //boolean值
        System.out.println(collection.containsAll(collection2));
        System.out.println(collection2.isEmpty());
//        collection.remove("a");
//        System.out.println(collection);
        System.out.println(collection2.retainAll(collection));
        Object[] objects = collection.toArray();


    }
}
