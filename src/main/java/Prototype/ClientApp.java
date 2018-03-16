package Prototype;

/**
 * Created by dylanb on 15/03/2018.
 */
public class ClientApp {
    public static void main(String[] args){

        // Handles routing makeCopy method calls to the right subclasses of Animal

        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Dog instance

        Dog Lexi = new Dog();

        // Creates a clone of Lexi and stores it

        Dog clonedDog = (Dog) animalMaker.getClone(Lexi);

        // These are exact copies of each other

        System.out.println(Lexi);

        System.out.println(clonedDog);

        System.out.println("Lexi HashCode: " + System.identityHashCode(System.identityHashCode(Lexi)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedDog)));

    }

}
