package state;

public class Package {
    private PackageState currentState;

    public Package() {
        this.currentState = new OrderedState();
    }

    public void printStatus() {
        currentState.printStatus();
    }

    public void goForward() {
        currentState.gotToNextStep(this);
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }
}
