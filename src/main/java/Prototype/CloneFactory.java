package Prototype;

/**
 * Created by dylanb on 15/03/2018.
 */
public class CloneFactory {

    // Receives any Animal, or Animal subclass and makes a copy of it and stores it
    // CloneFactory has no idea what these objects are except that they are subclasses of Animal

    public Animal getClone(Animal animalSample) {

        // Because of Polymorphism the dog makeCopy()
        // is called here instead of Animals

        return animalSample.makeCopy();

    }
}
