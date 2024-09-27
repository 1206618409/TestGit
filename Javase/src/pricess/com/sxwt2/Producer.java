package pricess.com.sxwt2;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 11:16
 **/
public class Producer implements Runnable{
    private Goods goods;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                goods.set("娃哈哈", "矿泉水");
            } else {
                goods.set("旺仔", "小馒头");
            }

        }
    }

    public Producer(Goods goods) {
        this.goods = goods;
    }
}


