package bridge;

public class RemoteControl {
    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public String switchOn() {
        device.switchOn();
        return device.printStatus();
    }

    public String switchOff() {
        device.switchOff();
        return device.printStatus();
    }
}
