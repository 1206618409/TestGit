package Colletctions.coll;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");
        System.out.println(linkedList);
        linkedList.add(2,"ahah");
        System.out.println(linkedList);
        linkedList.addFirst("111");
        System.out.println(linkedList);
        linkedList.addLast(2222);
        System.out.println(linkedList);
        System.out.println(linkedList.element());
        linkedList.offer("333");
        System.out.println(linkedList);
        linkedList.push(123);//压栈 先进后出
        linkedList.poll();//取


    }
}
