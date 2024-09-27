package Lambda_.com.abc4;

import java.util.ArrayList;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 14:02
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18, 60));
        list.add(new Student("李四", 15, 50));
        list.add(new Student("王五", 17, 70));
        list.add(new Student("赵六六", 19, 89));
        list.add(new Student("田七", 20, 97));

        getFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getAge()>14;
            }
        });
        getFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getSorce()>75;
            }
        });
        System.out.println("------------------------------");
        getFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getName().length()>2;
            }
        });

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


