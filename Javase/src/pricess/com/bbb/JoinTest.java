package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:39
 **/
public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-------------"+i);
            if (i==3){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


