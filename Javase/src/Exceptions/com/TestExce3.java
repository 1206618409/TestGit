package Exceptions.com;

public class TestExce3 {
    public static void main(String[] args) {
        os("20");
        os("a");

    }
    public  static void os(String s){
        try {
            int a = Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("数字转换异常");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出现异常啦");
            e.printStackTrace();
        }
    }
}
