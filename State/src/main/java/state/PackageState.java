package state;

public interface PackageState {
    void gotToNextStep(Package thePackage);

    void printStatus();
}
