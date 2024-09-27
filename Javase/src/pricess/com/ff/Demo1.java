package pricess.com.ff;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 16:01
 **/
public class Demo1 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"-------------->"+i);
            }
        }
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Thread thread = new Thread(demo1);
        thread.start();

        for (int i = 0; i <=100 ; i+=2) {
            System.out.println(Thread.currentThread().getName()+"--------->"+i);
        }
    }
}


