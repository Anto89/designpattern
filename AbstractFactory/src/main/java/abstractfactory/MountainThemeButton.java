package abstractfactory;

public class MountainThemeButton implements Button {
    @Override
    public void draw() {
        System.out.println("Green button");
    }
}
