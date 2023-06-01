package Getters_And_Setters;

public class Introduce {
    public static void main (String[] args){
        Person p=new Person();

        p.setName("");
        p.setAge(5);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
