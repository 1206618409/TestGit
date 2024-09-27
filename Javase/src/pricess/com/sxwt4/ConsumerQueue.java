package pricess.com.sxwt4;

import java.lang.ref.PhantomReference;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 14:31
 **/
public class ConsumerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;
    private Goods goods;
    public ConsumerQueue(BlockingQueue blockingDeque) {
        this.blockingQueue = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费的产商品" + goods.getBrand()+"-------"+goods.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}


