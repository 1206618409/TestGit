package Lambda_.com.abc2;

import java.util.ArrayList;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 13:04
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",18,60));
        list.add(new Student("李四",15,50));
        list.add(new Student("王五",17,70));
        list.add(new Student("赵六",19,89));
        list.add(new Student("田七",20,97));
        findByAge(list);
        System.out.println("-----------------------------");
        findByScore(list);
    }
    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for (Student student:students){
            if (student.getSorce()>70){
                list.add(student);
            }
        }
        for(Student stu:list){
            System.out.println(stu);
        }
    }

    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for (Student student:students){
            if (student.getAge()>16){
                list.add(student);
            }
        }
        for(Student stu:list){
            System.out.println(stu);
        }
    }
}


