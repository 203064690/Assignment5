package Chain_of_Responsibility;

/**
 * Created by dylanb on 15/03/2018.
 * The chain of responsibility pattern
 */
public class DivideNumbers implements Chain{
    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if (request.getCalculationnWanted() == "div"){
            System.out.println(request.getNumber1()+ " / "+ request.getNumber2()+ " = "+(request.getNumber1()/request.getNumber2()));
        }else{
            System.out.println("Only works for add, sub, mult, and div");
        }
    }
}
