package pricess.com.sxwt3;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 13:53
 **/
public class Pruducer implements Runnable {
    private Goods goods;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (i%2==0){
                goods.set("娃哈哈","矿泉水");
            }else {
                goods.set("旺仔","小馒头");
            }
        }
    }

    public Pruducer(Goods goods) {
        this.goods = goods;
    }
}


