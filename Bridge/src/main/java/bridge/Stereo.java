package bridge;

public class Stereo implements Device {
    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public String printStatus() {
        return "** Device under control : Stereo **\n" +
                "Status set to " + (isOn ? "On" : "Off");
    }
}
