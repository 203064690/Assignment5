package Abstract_Factory;

/**
 * Created by dylanb on 14/03/2018.
 */
public class Deposit extends Transaction{

    private double amount;

    public Deposit(int num, double amt){
        setAccountNumber(num);
        setAmount(amt);
    }



    public void execute(){
        System.out.println("executing Deposit for account " +super.getAccountNumber() + " for the amount of R"+super.getAmount());
    }

}
