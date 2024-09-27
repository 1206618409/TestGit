package pricess.com.sxwt3;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-08 13:54
 **/
public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;
    public Goods() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public synchronized void get(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"----"+this.getName());
        flag = false;
        notify();
    }


    public synchronized void set(String brand,String name){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "--" + this.getName());
        flag = true;
        notify();
    }

}


