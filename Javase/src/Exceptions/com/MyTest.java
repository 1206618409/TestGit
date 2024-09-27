package Exceptions.com;

public class MyTest {

    public static void main(String[] args) {

        System.out.println("main 代码块中的执行结果为：" + myMethod());
    }

    public static int myMethod() {

        int i = 6;
        try {
            System.out.println("try 代码块被执行！");

             i = i/0;

            return 1;
        } catch (Exception e) {
            System.out.println("catch 代码块被执行！");
            return 2;
        } finally {
            System.out.println("finally 代码块被执行！");
        }

    }

}