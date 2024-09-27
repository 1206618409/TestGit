package Exceptions.com;

public class FinallyExption {
    public static void main(String[] args) {
       test(5);
        }

    public static int test(int a){
        try{
            System.out.println(1/0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("程序结束了");
            return 0;

        }
    }
}