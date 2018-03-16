package Bridge_Pattern;

/**
 * Created by dylanb on 16/03/2018.
 * With the Bridge Design Pattern you create 2 layers of abstraction
 */
public abstract class EntertainmentDevice {

    public int deviceState;

    public int maxSetting;

    public int volumeLevel = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback() {

        if(deviceState > maxSetting || deviceState < 0) { deviceState = 0; }

        System.out.println("On Channel " + deviceState);

    }

    public void buttonSevenPressed() {

        volumeLevel++;

        System.out.println("Volume at: " + volumeLevel);

    }

    public void buttonEightPressed() {

        volumeLevel--;

        System.out.println("Volume at: " + volumeLevel);

    }
}
