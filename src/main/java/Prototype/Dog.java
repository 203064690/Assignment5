package Prototype;

/**
 * Created by dylanb on 15/03/2018.
 */
public class Dog implements Animal{
    public Dog(){
        System.out.println("Dog is Made");
    }

    public Animal makeCopy() {
        System.out.println("Dog is Being Made");

        Dog dogObject = null;

        try {
            // Calls the Animal super classes clone()

            // Then casts the results to Dog

            dogObject = (Dog) super.clone();

        }
        // If Animal didn't extend Cloneable this error is thrown

	        catch (CloneNotSupportedException e) {

            System.out.println("The Dog was Turned to Hotdogs");

            e.printStackTrace();

        }
        return dogObject;

    }

    @Override
    public String toString() {
        return "This is cloneing";
    }
}
