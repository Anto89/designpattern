package command;

import java.util.List;

public class FoodOrder implements Order {
    private Cook cook;
    private List<String> allergens;

    public FoodOrder(Cook cook, List<String> allergens) {
        this.cook = cook;
        this.allergens = allergens;
    }

    public String execute() {
        return cook.cookSomething(allergens);
    }
}
