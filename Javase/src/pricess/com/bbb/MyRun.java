package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:37
 **/
public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----------"+i);
        }
    }

}


