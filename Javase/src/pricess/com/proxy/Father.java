package pricess.com.proxy;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 18:11
 **/
public class Father implements Cry {
    @Override
    public void cry() {
        System.out.println("this bb 哭了");
    }

    @Override
    public void ssh() {
        System.out.println("this bb跳了");
    }
}


