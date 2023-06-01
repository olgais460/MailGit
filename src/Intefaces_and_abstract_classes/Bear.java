package Intefaces_and_abstract_classes;

public  class Bear extends Animal implements AbleToRun {
    String description = "The bear is smart";

    void makeNoise() {
        System.out.println("AAAAAAA");
    }

    void eat() {
        System.out.println("I eat berries and honey");
    }

    @Override
    String getDescription(Animal animal) {
        System.out.println(description);
        return description;

    }

    @Override
    public void run() {
        System.out.println("Dear bear is running");

    }
}




