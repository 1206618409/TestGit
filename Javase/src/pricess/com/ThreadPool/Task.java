package pricess.com.ThreadPool;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 16:18
 **/
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"running");
    }
}


