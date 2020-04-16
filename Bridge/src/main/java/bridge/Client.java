package bridge;

public class Client {
    public static void main(String... args) {
        var remoteTv = new RemoteControl(new TV());
        System.out.println(remoteTv.switchOn());

        var remoteStereo = new RemoteControl(new Stereo());
        System.out.println(remoteStereo.switchOff());
    }
}
