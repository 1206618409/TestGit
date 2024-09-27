package pricess.com.proxy;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:16
 **/
public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.cry();
        d.ssh();
        Dd dd = new Dd();
        Dog d3 = new Dog(dd);
        dd.cry();
        dd.ssh();
    }
}


