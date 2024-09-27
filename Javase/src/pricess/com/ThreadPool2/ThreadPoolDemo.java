package pricess.com.ThreadPool2;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 14:02
 **/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(5));
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {

                    System.out.println(Math.random());
                }
            }
        });
        threadPoolExecutor.shutdown();

    }
}


