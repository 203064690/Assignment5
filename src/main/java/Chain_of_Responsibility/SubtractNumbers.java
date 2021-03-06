package Chain_of_Responsibility;

/**
 * Created by dylanb on 15/03/2018.
 * The chain of responsibility pattern
 */
public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if (request.getCalculationnWanted() == "sub"){
            System.out.println(request.getNumber1()+ " - "+ request.getNumber2()+ " = "+(request.getNumber1()-request.getNumber2()));
        }else{
            nextInChain.calculate(request);
        }
    }
}
