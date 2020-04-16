package command;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

// Receiver
public class Cook {
    public String grabSomeDrink() {
        return "Here is your beer.";
    }

    public String cookSomething(List<String> allergens) {
        return format("Beautiful cookies without %s.", allergens.stream().collect(Collectors.joining(",")));
    }
}
