package Intefaces_and_abstract_classes;


public class Vet implements AbleToRun {
   public void treatAnimal( Animal animal) {

        System.out.println(animal.name);
        animal.getDescription(animal);


    }

    @Override
    public void run() {
        System.out.println("The Vet is running");
    }
}

