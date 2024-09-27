package pricess.com.proxy;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:09
 **/
public class Dog implements Cry {
    private Cry cry;


    public Dog() {
        this.cry = new Father();
    }

    @Override
    public void cry() {
        this.cry.cry();
    }

    public Dog(Cry cry) {
        this.cry = cry;
    }

    @Override
    public void ssh() {
       this.cry.ssh();
    }
}


