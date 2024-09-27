package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 8:59
 **/
public class SleepTest2 implements Runnable{
    public static void main(String[] args) {
        SleepTest2 sleepTest2 = new SleepTest2();
        Thread thread = new Thread(sleepTest2);
        thread.start();
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"---------"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void run() {
        for (int i = 10; i >0 ; i--) {
            try {
                Thread.sleep(1001);
                System.out.println(Thread.currentThread().getName()+"---------"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


