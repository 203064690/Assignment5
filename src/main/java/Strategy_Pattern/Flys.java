package Strategy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */

// The interface is implemented by many other subclasses that allow for many types of flying without effecting Animal, or Flys.


public interface Flys {

    String fly();

}

// Class used if the Animal can fly

class ItFlys implements Flys{

    public String fly() {

        return "Flying High";

    }

}

//Class used if the Animal can't fly

class CantFly implements Flys{

    public String fly() {

        return "I can't fly";

    }
}
