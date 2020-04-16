package bridge;

public class TV implements Device {
    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public String printStatus() {
        return "** Device under control : TV **\n" +
                "Status set to " + (isOn ? "On" : "Off");
    }
}