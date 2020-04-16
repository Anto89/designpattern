package state;

public class DeliveredState implements PackageState {

    public void gotToNextStep(Package thePackage) {
        System.out.println("Waiting for package to be received.");
        thePackage.setCurrentState(new ReceivedState());
    }

    public void printStatus() {
        System.out.println("Package delivered !");
    }
}
