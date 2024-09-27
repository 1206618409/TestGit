package Lambda_1.abc3;

import io_demo.Commons.Commons_ioTest;
import io_demo.Demo.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 8:50
 **/
public class Test3 {
    public  String put(){
        return "aaa";
    }
    public  void setSize(int size){
        System.out.println("size"+size);
    }

    public String toUpperCase(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(new Test3().put());
        Supplier<String>s1 = ()->new Test3().put();
        Supplier<String> s2 = ()->{return new Test3().put();};
        Supplier<String> s3 = new Test3()::put;
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());
        //唯一的创建一个test3对象
        //实例方法的引用
        Test3 test3 = new Test3();
        Consumer<Integer> c1 = (size)->new Test3().setSize(size);
        Consumer<Integer> c2 = new Test3()::setSize;
        Consumer<Integer>c3 = test3::setSize;
        Function<String,String> f1 =(str)->str.toUpperCase();
        Function<String,String> f2 = (str)->test3.toUpperCase(str);
        Function<String,String> f3 = new Test3()::toUpperCase;
        Function<String,String> f4 = test3::toUpperCase;
        System.out.println(f1.apply("abc"));
        System.out.println(f2.apply("abc"));
        System.out.println(f3.apply("abc"));
        System.out.println(f4.apply("abc"));
    }
}
