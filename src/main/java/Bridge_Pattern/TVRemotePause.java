package Bridge_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 */
public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }
}