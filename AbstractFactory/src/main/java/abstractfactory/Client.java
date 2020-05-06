package abstractfactory;

public class Client {
    public static void main(String... args) {
        ThemeFactory themeFactory = ThemeFactory.getFactory(ThemeType.Ocean);
        Button button = themeFactory.createButton();
        button.draw();
        Checkbox checkbox = themeFactory.createCheckbox();
        checkbox.draw();
    }
}
