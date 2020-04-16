package command;

// Invoker
public class Waiter {
    String executeOrder(Order order) {
        return order.execute();
    }
}
