package Intefaces_and_abstract_classes;

public class Cat extends Animal {

    String description = "The cat is fury";

    void makeNoise() {
        System.out.println("Meow");
    }

    void eat() {
        System.out.println("I eat fish and milk");
    }

    @Override

    String getDescription(Animal animal) {

        System.out.println(description);
        return description;



    }
}


//String getDescription() {
//        ;
//       ; System.out.println(description);
//        return description;
