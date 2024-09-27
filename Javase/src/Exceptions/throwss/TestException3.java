package Exceptions.throwss;

public class TestException3 {
    public static void main(String[] args) {
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void show() throws Exception {
        String gender = "1234";
        if (gender.equals("man")){
            System.out.println("man");
        }else if (gender.equals("woman")){
            System.out.println("woman");
        }else{
            //throw new Exception("性别出现错误");
            throw new GenderException("gender is wrong");
        }
    }
}
