package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 15:35
 **/

/*
  此时出现问题：


 */
public class TIcketThread extends Thread{
   private static int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");

            }
        }
    }

    public static void main(String[] args) {
        TIcketThread t1 = new TIcketThread();
        TIcketThread t2 = new TIcketThread();
        TIcketThread t3 = new TIcketThread();
        TIcketThread t4 = new TIcketThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


