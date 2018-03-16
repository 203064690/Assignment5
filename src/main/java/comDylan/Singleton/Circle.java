package comDylan.Singleton;

import javax.swing.*;

/**
 * Dylan Baadjies
 *
 * The Singleton Pattern defines a getInstance
 *
 */
public class Circle
{
    private int radius;

    private static Circle circle = null;

    public static void main( String[] args )
    {
        String rad1 = JOptionPane.showInputDialog("Please enter radius for 1st Circle: ");
        int num1 = Integer.parseInt(rad1);

        getInstance().setRadius(num1);

        JOptionPane.showMessageDialog(null,getInstance().toString(),"The 1st Circle", JOptionPane.INFORMATION_MESSAGE);

    }

    public Circle(){

    }

    public static Circle getInstance(){
        if(circle == null){
            circle = new Circle();
        }
        return circle;
    }

    public void setRadius(int r) {

        radius = r;
    }

    public int getRadius() {

        return radius;
    }

    public int getDiameter() {

        return radius * 2;
    }

    public double getCircumference() {

        return Math.PI*radius*2;
    }

    public double area() {

        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {

        String string;
        return string = String.format("Radius: %d\nDiameter: %d\nCircumference: %.2f\nThe Area: %.2f", radius, getDiameter(), getCircumference(), area());
    }
}
