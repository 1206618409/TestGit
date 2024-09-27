package Lambda_1.abc2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 17:48
 **/
public class LambdaTest {
    public static void main(String[] args) throws Exception {
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };

        Runnable runnable2 = ()-> System.out.println("Running");
        Callable<String> c1 = new Callable() {
            @Override
            public String call() throws Exception {
                return "呵呵";
            }
        };
        System.out.println(c1.call());
        Callable<String> c2 = ()->{return "hehe";};
        System.out.println(c2.call());

        Callable<String> c3 = ()->"hehe";
        System.out.println(c3.call());

        Functions f2 = (Student) -> System.out.println("字符串2");

        Functions f3 = (Student s3) -> System.out.println("字符串3");

        f2.get(new Student());
        f3.get(new Student());

        Function<String,Integer> ft = (str)->{return str.length();};
        System.out.println(ft.apply("asasasa"));

        Supplier<String> s1 = ()->{return "hehe";};
        Supplier<String> s2 = ()->{return "hehehe";};
        System.out.println(s1.get());
        System.out.println(s2.get());

        Consumer<String> c11 = (str)-> System.out.println(str);
        c11.accept( "java");

        Runnable runnable1 = ()->{int i = get();
            System.out.println(i);};
        runnable1.run();
        Runnable runnable3 = ()->exec();
        runnable3.run();
        LambdaInterface l1 = ()->true?1:0;
        System.out.println(l1.get());*/
        BiFunction<String,String,Integer> bf = (a,b)-> a.length()+b.length();
        System.out.println(bf.apply("呵呵","dd"));
        List<String> list =  Arrays.asList("f","b","c","a");
        /*for (String s : list) {
            System.out.println(s);
        }*/
        list.forEach(System.out::println);

    }

    static int get(){
        return 1;
    }
    static String find(){
        return "find";
    }
    static void exec(){
        find();
    }
}


