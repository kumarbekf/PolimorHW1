public class Main {
    public static void main(String[] args) {
       Shark shark = new Shark();
       Turtle turtle = new Turtle();
       Eagle eagle = new Eagle();
        Animal[] animal = {shark,turtle,eagle};
met(animal);

    }
    public static void met(Animal[] animals){
        for (Animal animal : animals) {
            if (animal instanceof Animal){
                ((Animal)animal).Anim();
                System.out.println(animal.getClass());
            }else if (animal instanceof Shark){
                ((Shark)animal).attack();
                System.out.println(animal.getClass());
            } else if (animal instanceof Turtle) {
                ((Turtle)animal).swim();
                System.out.println(animal.getClass());
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
                System.out.println(animal.getClass());
            }

        }
    }
}