package pricess.com.sxwt4;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 14:30
 **/
public class ProducerQueue implements Runnable {
    private Goods goods;
    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (i%2==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else{
                goods = new Goods("旺仔","小馒头");
            }
            System.out.println("生产者开始生产商品了"+goods.getBrand()+"---"+goods.getName());
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


