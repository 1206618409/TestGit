package Colletctions.abc;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TestPerson implements Comparator<Person> {
    public static void main(String[] args) {
//        HashSet hashSet = new HashSet();
//        hashSet.add(new Person("zhangsan",18));
//        hashSet.add(new Person("zhangsan",18));
//        hashSet.add(new Person("wangwu",20));
//        System.out.println(hashSet);


        TreeSet treeSet = new TreeSet(new TestPerson());

        treeSet.add(new Person("zhangsan",18));
        treeSet.add(new Person("lisi",18));
        treeSet.add(new Person("wangwu",20));
        treeSet.add(new Person("zhaoliu",17));
        treeSet.add(new Person("tianqi",20));
        System.out.println(treeSet);
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()>o2.getAge()){
            return -1;

        }else if (o1.getAge()<o2.getAge()){
            return 1;
        }else {
            return 0;
        }
    }
}
