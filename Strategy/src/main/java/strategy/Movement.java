package strategy;

import static java.lang.String.format;

public class Movement {
    private String destination;
    private TransportAgent transportAgent;

    public Movement(String destination) {
        this.destination = destination;
    }

    public void goTo() {
        System.out.println(format("Let's go to %s %s'", destination, transportAgent.move()));
    }

    public void setTransportAgent(TransportAgent transportAgent) {
        this.transportAgent = transportAgent;
    }
}
