package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 15:48
 **/
public class TicketRunnable implements Runnable {
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (ticket>0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }
    public static void main(String[] args) {
        TicketRunnable ticket = new TicketRunnable();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        Thread t4 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


