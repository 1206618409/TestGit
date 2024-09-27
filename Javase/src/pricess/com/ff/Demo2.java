package pricess.com.ff;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 16:07
 **/
public class Demo2 extends Thread {
    @Override
    public void run() {
       for (int i = 0; i <=100 ; i+=2) {
           System.out.println(Thread.currentThread().getName()+"--------->"+i);
       }
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.start();
        for (int i = 0; i <=100 ; i+=2) {
            System.out.println(Thread.currentThread().getName()+"--------->"+i);
        }
    }
}


