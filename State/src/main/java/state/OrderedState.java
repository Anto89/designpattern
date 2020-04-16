package state;

public class OrderedState implements PackageState {

    public void gotToNextStep(Package thePackage) {
        System.out.println("Ready to be delivered.");
        thePackage.setCurrentState(new DeliveredState());
    }

    public void printStatus() {
        System.out.println("Package ordered !");
    }
}
