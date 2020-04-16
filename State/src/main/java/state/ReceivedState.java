package state;

public class ReceivedState implements PackageState {

    public void gotToNextStep(Package thePackage) {
        System.out.println("Process ended.");
    }

    public void printStatus() {
        System.out.println("Package received !");
    }
}
