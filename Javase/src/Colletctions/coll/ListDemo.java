package Colletctions.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**        List
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
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("1");
        list.add(true);
        //System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));//向后找

        list.set(0,"abc");
        System.out.println(list);
        List list1 = list.subList(0, 2);
        System.out.println(list1);
        List of = List.of(1,2,3,4);
        System.out.println(of);

    }
}
