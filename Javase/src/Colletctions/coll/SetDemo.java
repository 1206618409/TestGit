package Colletctions.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
        1、set中存放的是无序，唯一的数据
           2、set不可以通过下标获取对应位置的元素的值，因为无序的特点
           3、使用treeset底层的实现是treemap,利用红黑树来进行实现
           4、设置元素的时候，如果是自定义对象，会查找对象中的equals和hashcode的方法，如果没有，比较的是地址
           5、树中的元素是要默认进行排序操作的，如果是基本数据类型，自动比较，如果是引用类型的话，需要自定义比较器
               比较器分类：
                 内部比较器
                       定义在元素的类中，通过实现comparable接口来进行实现
                 外部比较器
                       定义在当前类中，通过实现comparator接口来实现，但是要将该比较器传递到集合中
                 注意：外部比较器可以定义成一个工具类，此时所有需要比较的规则如果一致的话，可以复用，而
                       内部比较器只有在存储当前对象的时候才可以使用
                       如果两者同时存在，使用外部比较器
                       当使用比较器的时候，不会调用equals方法
 */
public class SetDemo {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add("123");
//        set.add(1);
//        set.add("123");
//        System.out.println(set);
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("--------------------------");
//        //将While循环改成for循环  推荐使用
//        for(Iterator it = set.iterator();it.hasNext();){
//            System.out.println(it.next());
//        }
//
        TreeSet treeSet = new TreeSet();
        treeSet.add(31);
        treeSet.add(1);
        treeSet.add(65);
        System.out.println( treeSet.ceiling(1));


        System.out.println(treeSet);


    }
}
