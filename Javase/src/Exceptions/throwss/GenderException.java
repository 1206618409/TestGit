package Exceptions.throwss;

public class GenderException extends Exception{
    public GenderException(){
        System.out.println("性别异常");
    }
    public GenderException(String s){
        System.out.println(s);
    }
}
