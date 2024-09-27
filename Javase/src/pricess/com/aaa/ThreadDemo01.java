package pricess.com.aaa;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 14:38
 **/
public class ThreadDemo01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i <100 ; i++) {
            System.out.println("HelloWorld");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }

}


