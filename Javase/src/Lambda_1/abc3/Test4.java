package Lambda_1.abc3;

import java.awt.image.TileObserver;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 9:10
 **/
public class Test4 {
    public static void main(String[] args) {
        Consumer<Too> c1 = (coo)->new Too().foo();
        c1.accept(new Too());
        Consumer<Too2> c2 = (Too2 coo)->new Too().foo();
        c2.accept(new Too2());
        Consumer<Too> c3 = Too::foo;
        c3.accept(new Too());
        Consumer c4 = (too)->new Too2().show();
        c3.accept(new Too());
        BiConsumer<Too2,String> b2 = ((too2, s) -> new Too2().show());
        System.out.println("----------------------------------------");
        BiConsumer<Too2,String> b3 = Too2::abc;
        b3.accept(new Too2(),"def");

    }
}
class Too {
    public Integer fly(String str) {
        return 1;
    }

    public void foo() {
        System.out.println("foo");
    }
}
class Too2{
    public Integer fly(String str){
            return 1;
    }
    public void foo(){
            System.out.println("foo---too2");
    }

    public void show(){
        System.out.println("show");
    }
    public void abc(String s){

        System.out.println("--------"+s);
    }
}


