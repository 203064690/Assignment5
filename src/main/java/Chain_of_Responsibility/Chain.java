package Chain_of_Responsibility;

/**
 * Created by dylanb on 15/03/2018.
 * The chain of responsibility pattern
 */
public interface Chain {

    public abstract void setNextChain(Chain nextChain);

    public abstract void calculate(Numbers request);
}
