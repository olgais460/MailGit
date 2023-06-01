package Intefaces_and_abstract_classes;

import java.util.ArrayList;

import static java.lang.System.*;

public class Farm {
    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Barsic";
        Animal dog = new Dog();
        dog.name = "Bobic";
        Animal bear = new Bear();
        bear.name = "Misha";
        animals.add(cat);
        animals.add(dog);
        animals.add(bear);
        cat.eat();                    // мелод eat

        out.println(animals.size()); // выводим размер массива

        for (Animal animal : animals) {
            Vet Kolya = new Vet();
            Kolya.treatAnimal(animal);

        }
        out.println("About the cat " + cat.name);
        cat.makeNoise();
        cat.eat();
        out.println();

        out.println("About the dog " + dog.name);
        dog.makeNoise();
        dog.eat();
        out.println();

        out.println("About the bear " + bear.name);
        bear.makeNoise();
        bear.eat();


        AbleToRun A1=new Vet() ;
            A1.run();
        AbleToRun A2=new Bear();
        A2.run();

        Animal animal1=new Animal() {
            @Override
            void makeNoise() {
                out.println("Animal 1 makes noise");
            }

            @Override
            void eat() {
            }

            @Override
            String getDescription(Animal animal) {
                return null;
            }
        };
        animal1.makeNoise();

        AbleToRun AbleToRun1= () -> out.println("Новый экземпляр бежит");
        AbleToRun runner= () -> out.println("runner runs");
         runner.run();
        AbleToRun1.run();

            }
        }







