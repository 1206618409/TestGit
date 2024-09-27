package Lambda_.com.abc3;

import Lambda_.com.abc3.Student;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 13:13
 **/
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}


