package Lambda_.com.abc2;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 13:03
 **/
public class Student {
    private String name;
    private int age;
    private int sorce;

    public Student(String name, int age, int sorce) {
        this.name = name;
        this.age = age;
        this.sorce = sorce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSorce() {
        return sorce;
    }

    public void setSorce(int sorce) {
        this.sorce = sorce;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sorce=" + sorce +
                '}';
    }
}


