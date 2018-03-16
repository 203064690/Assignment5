package Adapter_Pattern;

/**
 * Created by dylanb on 15/03/2018.
 * Adapter Pattern
 * The Client
 */
public class Run_Adapter_Pattern {
    public static void main(String[] args){

        Dog pitbull = new Dog();

        TrainedDog germanShephard = new TrainedDog();

        Animal TrainedDog_Adapter = new TrainedDog_Apdapter(germanShephard);

        System.out.println("The Guard dog");

        germanShephard.naps();
        germanShephard.lunch();

        System.out.println("Lexi");
        pitbull.sleep();
        pitbull.eat();

        System.out.println("The TrainedDog with Adapter");
        TrainedDog_Adapter.sleep();
        TrainedDog_Adapter.eat();

    }
}
