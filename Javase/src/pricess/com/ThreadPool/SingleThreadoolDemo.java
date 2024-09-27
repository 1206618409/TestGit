package pricess.com.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 17:08
 **/
public class SingleThreadoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i <20 ; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}


