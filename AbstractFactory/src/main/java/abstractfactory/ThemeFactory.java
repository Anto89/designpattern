package abstractfactory;

public abstract class ThemeFactory {
    static ThemeFactory getFactory(ThemeType theme) {
        if (ThemeType.Ocean == theme) {
            return new OceanThemeFactory();
        } else if (ThemeType.Mountain == theme) {
            return new MountainThemeFactory();
        }
        return null;
    }

    abstract Button createButton();

    abstract Checkbox createCheckbox();
}
