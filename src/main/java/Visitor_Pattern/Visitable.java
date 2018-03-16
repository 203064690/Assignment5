package Visitor_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public interface Visitable {

    // Allows the Visitor to pass the object so the right operations occur on the right type of object.
    public double accept(Visitor visitor);
}
