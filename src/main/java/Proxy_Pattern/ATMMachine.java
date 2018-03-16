package Proxy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public class ATMMachine implements GetATMData{

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    // NEW STUFF

    public ATMState getATMState() { return atmState; }
    public int getCashInMachine() { return cashInMachine; }

    public void insertPin(int i) {
    }

    public void requestCash(int i) {
    }

    public void insertCard() {
    }

    public void ejectCard() {
    }
}
