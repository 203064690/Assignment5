package Chain_of_Responsibility;

/**
 * Created by dylanb on 16/03/2018.
 * The chain of responsibility pattern
 */
public class RunCalcChain {
    public static void main(String[] args){

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "div");

        chainCalc1.calculate(request);
    }
}
