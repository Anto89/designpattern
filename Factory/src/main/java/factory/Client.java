package factory;

import java.util.List;

public class Client {
    public static void main(String... args) {
        List<Fighter> army = List.of(FighterFactory.createFighter(FighterType.Sniper),
                FighterFactory.createFighter(FighterType.Infantry));

        army.forEach(Fighter::fight);
    }
}
