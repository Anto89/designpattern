package strategy;

public class Client {
    public static void main(String[] args) {
        Movement movement = new Movement("Corfu");
        movement.setTransportAgent(new ByFoot());
        movement.goTo();

        System.out.println("A bit slow anyway ...");
        movement.setTransportAgent(new ByCar());
        movement.goTo();

        System.out.println("Here we go :)");
    }
}
