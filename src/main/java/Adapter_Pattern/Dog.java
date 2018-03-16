package Adapter_Pattern;

/**
 * Created by dylanb on 15/03/2018.
 * Adapter Pattern
 * The Target
 */
public class Dog implements Animal {


    public void eat() {
        System.out.println("A dog eats dog food");
    }

    public void sleep() {
        System.out.println("A dog sleeps 4hrs during the day");
    }
}
