package Exceptions.throwss;

public class Exception2 {
    /**
     * throws 声明异常
     * 在异常情况出现的时候，可以使用try...catch...finally的方式对异常进行处理，另外一种比较简单的方式就是在方法的最外层调用处理一次即可
     * 1、使用throws的方法，对所有执行过程中的所有方法出现的异常进行统一处理
     * 2、如何判定是使用throws 还是使用trycatch..
     * 最稳妥的方式：是在每个方法中都进行异常处理
     * 最偷懒的方式是判断在整个调用的过程中，最外层调用方法时否有对异常的处理，如果有 直接使用throws 如果没有就是用try..catch..
     * throw :抛出异常
     */
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("123");
    }
    public static void  test() throws Exception{
        System.out.println(1/0);
    }
}
