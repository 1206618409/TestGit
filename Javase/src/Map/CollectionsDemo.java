package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("af");
        list.add("bff");
        list.add("cfff");
        list.add("dffff");
        Collections.addAll(list,"e","f","g");
        System.out.println(list);
      /*  list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               if (o1.length()>o2.length()){
                   return 1;
               }else if (o1.length()<o2.length()){
                   return -1;
               }else {
                   return 0;
               }

            }
        });
        System.out.println(list);
        Collections.sort(list);
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }else if (o1.length()<o2.length()){
                    return -1;
                }else {
                    return 0;
                }

            }
        });*/
        //二分查找的时候，需要首先进行排序操作，如果没有排序的话，是找不到指定元素的
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,"af"));
        Collections.shuffle(list);//随机排序
        System.out.println(list);
        Collections.reverse(list);//逆序
        System.out.println(list);
        Collections.fill(list,"aaa");//替换
        System.out.println(list);

    }
}
