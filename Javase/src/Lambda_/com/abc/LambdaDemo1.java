package Lambda_.com.abc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 12:29
 **/
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "c++", "python", "scala");
       /* Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (String s : list) {
            System.out.println(s);
        }*/

        Collections.sort(list,(a,b)->a.length()-b.length());
        list.forEach(System.out::println);

    }
}


