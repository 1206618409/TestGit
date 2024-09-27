package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:39
 **/
public class SleepTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-------------"+i);
            if (i==2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


