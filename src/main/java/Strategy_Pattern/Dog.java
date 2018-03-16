package Strategy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public class Dog extends Animal {

    public void digHole(){

        System.out.println("Dug a hole");

    }

    public Dog(){

        super();

        setSound("Bark");

        flyingType = new CantFly();

    }

}
