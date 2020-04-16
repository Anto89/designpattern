package command;

public class DrinkOrder implements Order {
    private final Cook cook;

    public DrinkOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public String execute() {
        return cook.grabSomeDrink();
    }
}
