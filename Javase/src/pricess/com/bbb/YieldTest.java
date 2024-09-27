package pricess.com.bbb;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:39
 **/
public class YieldTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i <15 ; i++) {
            if (i==5){
                Thread.yield();
                //thread.stop();
                System.out.println(Thread.currentThread().getName()+"-------------"+i+"礼让一次");

            }else{
                System.out.println(Thread.currentThread().getName()+"-------------"+i);
            }
        }
    }
}


