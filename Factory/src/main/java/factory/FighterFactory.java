package factory;

public class FighterFactory {
    public static Fighter createFighter(FighterType fighterType) {
        Fighter fighter = null;
        if (fighterType == FighterType.Sniper) {
            fighter = new Sniper();
        } else if (fighterType == FighterType.Infantry) {
            fighter = new Infantry();
        }
        return fighter;
    }
}
