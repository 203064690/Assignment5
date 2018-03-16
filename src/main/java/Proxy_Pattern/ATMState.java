package Proxy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
