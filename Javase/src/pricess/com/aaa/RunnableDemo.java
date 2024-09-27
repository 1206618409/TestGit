package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 15:24
 **/
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---------------"+i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----------"+i);
        }
    }

}


