package Getters_And_Setters;

public class Person {
    private String name;
    private int age;

    void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Введите имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Вы еще слишком молоды");
        } else {
            this.age = age;
        }
    }
        public int getAge () {
            return age;
        }

    }
