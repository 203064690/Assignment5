package Proxy_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 * // This interface will contain just those methods
 // that you want the proxy to provide access to
 */
public interface GetATMData {

    public abstract ATMState getATMState();
    public abstract int getCashInMachine();
}
