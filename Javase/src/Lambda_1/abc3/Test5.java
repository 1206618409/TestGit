package Lambda_1.abc3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 9:50
 **/
public class Test5 {
    public static void main(String[] args) {
        //无参数构造的使用
        Supplier<Person> s1 = ()->new Person();
        s1.get();
        Supplier<Person> s2 = Person::new;
        s2.get();
        Supplier<List> s3 = ArrayList::new;
        Consumer<Integer> c1 = Person::new;
        c1.accept(123);
        Function<Integer,Person> f1 = (str)->new Person(str);
        f1.apply(15);
        Function<Integer,Person> f2 = Person::new;
        f1.apply(12);
    }
}
class Person{
    public Person(){
        System.out.println("无参数构造方法");
    }
    public Person(int i){
        System.out.println("带参数的构造方法");
    }

}



