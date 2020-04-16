package command;

import static java.util.Collections.singletonList;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        // 1. Beer time !
        System.out.println(waiter.executeOrder(new DrinkOrder(cook)));

        // 2. Ok let's have some food now
        System.out.println(waiter.executeOrder(new FoodOrder(cook, singletonList("peanuts"))));
    }
}
