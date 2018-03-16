package Strategy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public class Bird extends Animal {

    // The constructor initializes all objects

    public Bird(){

        super();

        setSound("Tweet");

        flyingType = new ItFlys();

    }
}
