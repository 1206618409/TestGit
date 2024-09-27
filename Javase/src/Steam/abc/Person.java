package Steam.abc;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-11 13:33
 **/
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public static Person build(String name){
        Person p = new Person();
        p.setName(name);
        return p;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


