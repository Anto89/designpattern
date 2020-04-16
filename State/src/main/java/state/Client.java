package state;

public class Client {

    public static void main(String[] args) {
        Package thePackage = new Package();
        thePackage.printStatus();
        thePackage.goForward();
        thePackage.printStatus();
        thePackage.goForward();
        thePackage.goForward();
        thePackage.printStatus();

    }
}
