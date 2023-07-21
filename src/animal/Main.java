package animal;

import animal.Animal;
import animal.Eagle;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal[] animal = {shark, turtle, eagle};
        met(animal);
    }
    public static void met(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.getClass().getName().equals("animal.Shark")){
                ((Shark) animal).attack();
            }else if(animal.getClass().getName().equals("animal.Turtle")){
                ((animal.Turtle) animal).swim();
            }else if (animal.getClass().getName().equals("animal.Eagle")){
                ((animal.Eagle) animal).fly();
            }
            if (animal instanceof animal.Shark) {
                ((animal.Shark) animal).attack();
            } else if (animal instanceof animal.Turtle) {
                ((animal.Turtle) animal).swim();
            } else if (animal instanceof animal.Eagle) {
                ((animal.Eagle) animal).fly();
            }
        }
    }
}