package Chain_of_Responsibility;

/**
 * Created by dylanb on 15/03/2018.
 * The chain of responsibility pattern
 */
public class Numbers {

    private int number1;
    private int number2;

    private String calculationnWanted;

    public Numbers(int newNumber1, int newNumber2, String calcWanted){

        number1 = newNumber1;
        number2 = newNumber2;
        calculationnWanted = calcWanted;
    }

    public int getNumber1(){
        return number1;
    }

    public int getNumber2(){
        return number2;
    }

    public String getCalculationnWanted(){
        return calculationnWanted;
    }

}
