package pricess.com.sxwt3;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 13:57
 **/
public class Test03 {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Pruducer pruducer = new Pruducer(goods);
        Consumer consumer = new Consumer(goods);
        Thread thread1 = new Thread(pruducer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}


