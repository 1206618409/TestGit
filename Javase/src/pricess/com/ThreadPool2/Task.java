package pricess.com.ThreadPool2;

import java.util.concurrent.Callable;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 12:54
 **/
public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(200);
        return Thread.currentThread().getName()+"is running";
    }
}


