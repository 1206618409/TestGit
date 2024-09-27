package pricess.com.sxwt;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 11:29
 **/

    /*
    多线程访问的时候出现了数据安全的问题
        1、生产者没有生产商品，消费者就可以获取
        2、商品的品牌和名称对应不上

   */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread thread = new Thread(producer,"生产者");
        Thread thread2 = new Thread(consumer,"消费者");
        thread.start();
        thread2.start();

    }
}


