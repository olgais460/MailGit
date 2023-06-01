package Phone;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }

    void move(String fullName) {
        System.out.println(fullName + " двигается");
    }


}