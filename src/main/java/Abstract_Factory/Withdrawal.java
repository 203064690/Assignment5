package Abstract_Factory;

/**
 * Created by dylanb on 14/03/2018.
 */
public class Withdrawal extends Transaction{



    public void setWithdrawal(int num, double amt){
        setAccountNumber(num);
        setAmount(amt);
    }

    public String toString()  {
        return super.toString()+" Withdrawal class";
    }

    public void execute(){
        System.out.println("executing WithDrawal for account " +super.getAccountNumber() + " for the amount of R"+getAmount());
    }

}
