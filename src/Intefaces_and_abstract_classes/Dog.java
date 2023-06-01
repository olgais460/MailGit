package Intefaces_and_abstract_classes;

public class Dog extends Animal{
    String description = "The dog is friendly";
    void makeNoise() {
        System.out.println("Gav_Gav");
    }

    void eat() {
        System.out.println("I eat meat and bones");
    }

    @Override
    String getDescription(Animal animal) {
        System.out.println(description);
        return description;
    }
    }


