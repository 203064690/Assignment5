package Adapter_Pattern;

/**
 * Created by dylanb on 15/03/2018.
 * Adapter Pattern
 * The Apapter
 * adaptee.specificRequest
 */
public class TrainedDog_Apdapter implements Animal {
    TrainedDog trainedDog;

    public TrainedDog_Apdapter(TrainedDog newDog){
        trainedDog = newDog;
    }

    public void eat() {
        trainedDog.lunch();

    }

    public void sleep() {
        trainedDog.naps();
    }
}
