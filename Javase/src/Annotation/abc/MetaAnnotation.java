package Annotation.abc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 15:14
 **/
public class MetaAnnotation {
    //@MyAnnotation(name="hehe",age=12,id=3,likes = {"bookes","lok","movie"})
    @MyAnnotation
    public void test(){

    }
}
//Targer用来声明当前自定义的注解适合用于什么地方，类、方法、变量、包
@Target ({ElementType.METHOD,ElementType.TYPE})
//Retention:用来表示当前注释适用于什么环境，是源码级别还是类级别还是运行时环境，一般都是运行时环境
@Retention(RetentionPolicy.CLASS)
//说明该注解将被包含在javadoc中
@Documented
//表示当前注解是否能被继承
@Inherited
@interface MyAnnotation{
    //定义的方式看起来是方法,但是实际上使用在使用注解的时候填写的参数的名称，默认的名称是value
    //自定义注解中填写的所有方法都需要在使用注解的时候，添加值很麻烦因此包含默认值
    String name() default "zhangsan";
    int age() default 12;
    int id() default 1;
    String[]likes() default {"a","b","c","d"};

}


