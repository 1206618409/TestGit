package Lambda_.com.abc3;

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 13:29
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",18,60));
        list.add(new Student("李四",15,50));
        list.add(new Student("王五",17,70));
        list.add(new Student("赵六",19,89));
        list.add(new Student("田七",20,97));
        getFilter(list,new AgeFilter());
        System.out.println("------------------------------");
        getFilter(list,new ScoreFilter());
    }
    public static void getFilter(ArrayList<Student>students,StudentFilter filter){
        ArrayList<Student> list = new ArrayList<>();
        for (Student s:students) {
            if (filter.compare(s)){
                list.add(s);

            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students){
        for (Student student:students){
            System.out.println(student);
        }
    }
}


