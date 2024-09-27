package Lambda_1.abc3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 19:45
 **/
public class Test2 {
     static String put(){
         System.out.println("put");
     return "put";
     }
    public static void  getSize(int size){
        System.out.println(size);
    }
    public static void main(String[] args) {
        Supplier<String> s1  = ()->Test2.put();
        System.out.println(s1.get());

        Supplier<String> s2 = Test2::put;
        System.out.println(s2.get());
        Supplier s3 = Fun::hehe;
        System.out.println(s3.get());
        Consumer<Integer> c1 = Test2::getSize;
        c1.accept(123);
        BiFunction<String ,String,Integer> b1 =  (a,b)->a.length()+b.length();
        BiFunction<String,String,Integer> b2 = Fun::getlength;
        System.out.println(b1.apply("abc0","asasa"));
        System.out.println(b2.apply("abc0","asasa"));
    }
}

class Fun{
    public static String hehe(){
        return "hehe";
    }
    public static Integer getlength(String str,String str2){
        return str.length()+str2.length();
    }
}
