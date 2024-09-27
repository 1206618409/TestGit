package Steam.abc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 10:38
 **/
public class StreamDemo {
    //通过数组来生成
    public static void get(){
        String[]str = {"a","b","c","d"};
        Stream<String> str1 = Stream.of(str);
        str1.forEach(System.out::println);
    }
    //
    static void get3(){
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);
    }
    //通过集合来生成
    static void get2(){
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
    //通过Iterator
    static  void get4(){

        Stream<Integer> iterate = Stream.iterate(1, x ->x + 1);
        iterate.limit(10).forEach(System.out::println);
    }
    //其他方式
    static void get5(){
        String str = "abcdef";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);

    }
    public static void main(String[] args) {
        //Stream 生成操作
     /* get();
      get2();
      get3();rr
      get4();
      get5();*/
     //中间操作:如果调用方法之后返回的结果是Stream对象就意味着是一个中间操作
     Arrays.asList(1,2,3,4,5).stream().filter((x)->x%2==0).forEach(System.out::println);
     //求出集合所有偶数和
        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x % 2 == 0).mapToInt(x->x).sum();
        System.out.println(count);
        //求集合中做大值
        List<Integer> list = Arrays.asList(1,3,5,6,7,8,12,11);
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println(max.get());
        //求集合中最小值
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        System.out.println(min.get());
        //求字符串最小长度
        List<String> strings = Arrays.asList("abc", "defg", "assa", "a", "b");
        Optional<Integer> max1 = list.stream().max((a, b) -> a - b);
        System.out.println(max1.get());
        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());
        Optional<Integer> any2 = list.stream().filter(x -> x % 10 == 5).findFirst();
        System.out.println(any2.get());

        Stream<Integer> ss = list.stream().filter(i -> {
            System.out.println("呵呵");
            return i % 2 == 0;
        });
        System.out.println(ss.findAny().get());
        System.out.println("------------------------------");
               //获取最大值和最小值但是不适用min和max方法
        Optional<Integer> first = list.stream().sorted().findFirst();
        System.out.println(first.get());
        Optional<Integer> first1 = list.stream().sorted((a, b) -> b - a).findFirst();
        System.out.println(first1.get());
        System.out.println("---------------------------");
        Arrays.asList("abc", "defg", "assa", "a", "b").stream().sorted().forEach(System.out::println);
        Arrays.asList("abc", "defg", "assa", "a", "b").stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
        //将结合中元素进行过滤同时返回一个集合对象
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        //去重操作
        Arrays.asList(1,1,1,1,2,3,3,3,4,4,4,5,5,5,5,5).stream().distinct().forEach(System.out::println);
        Arrays.asList(1,1,1,1,2,3,3,3,4,4,4,5,5,5,5,5).stream().collect(Collectors.toSet()).forEach(System.out::println);
        //打印20-30这样的集合数据
        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);
        //求和
        String  str = "20,40,60,80,100";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());

        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());

        //创建一组自定义对象
        String str2 = "java,scala,python";
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        Stream.of(str2.split(",")).map(x->Person.build(x)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);
        //将str中每一个数值都打印出来，同时算出最终的求和结果
        Stream.of(str.split(",")).map(x->Integer.valueOf(x)).forEach(System.out::println);
        //求和结果
        System.out.println(Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());

        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
        System.out.println(list.stream().allMatch(x -> x % 2 > 0));

        //Stream<Object> objectStream = list.stream().flatMap(Runnable).;

    }

}


