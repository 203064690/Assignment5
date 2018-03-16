package Abstract_Factory;

/**
 * Created by dylanb on 14/03/2018.
 * Abstract Factory
 */
public abstract class Transaction {

    private int accountNumber;
    private double amount;

    public void setAccountNumber(int num){
        accountNumber = num;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAmount(double amt){
        amount = amt;
    }

    public double getAmount(){
        return amount;
    }

    public String toString()  {
        return "Account: " +accountNumber;
    }

    public abstract void execute();
}
