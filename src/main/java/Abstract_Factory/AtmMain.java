package Abstract_Factory;

/**
 * Created by dylanb on 14/03/2018.
 * Abstract Factory
 */
public class AtmMain {
    public static void main(String[] args) {
        Transaction transaction = new Deposit(347, 1500);

        trans(transaction);
    }

    public static void trans(Transaction tr){
        tr.execute();
    }
}
