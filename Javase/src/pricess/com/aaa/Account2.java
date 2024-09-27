package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 10:08
 **/
public class Account2 implements Runnable{
    private  int  money = 10;

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"，准备取款");
                if (money>0){
                    money--;
                    System.out.println("完成取款");
                    System.out.println("存款余额为"+money);
                }else{
                    System.out.println("余额不足易支付 "+Thread.currentThread().getName()+"的取款，余额为 0");
                    //break;
                }
            }

        }

    }

    public static void main(String[] args) {
        Account2 account = new Account2();
        Thread thread = new Thread(account,"张三");
        Thread thread2 = new Thread(account,"张三的妻子");
        thread.start();
        thread2.start();

    }
}


