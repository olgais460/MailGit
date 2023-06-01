package Seria;

import java.io.Serializable;

public class Person implements Serializable {


    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;


    }

    public String toString() {
        return name + ":" + id;
    }
}
