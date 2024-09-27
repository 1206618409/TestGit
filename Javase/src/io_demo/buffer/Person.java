package io_demo.buffer;

import java.io.Serializable;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 16:59
 **/
public class Person implements Serializable {
   // long serivalVersionUID = 1l;
    private int id;
    private String name;
    transient private String psd;

    public Person(int id, String name, String psd) {
        this.id = id;
        this.name = name;
        this.psd = psd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psd='" + psd + '\'' +
                '}';
    }
}


