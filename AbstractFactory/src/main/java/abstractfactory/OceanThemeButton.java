package abstractfactory;

public class OceanThemeButton implements Button {
    @Override
    public void draw() {
        System.out.println("Blue button");
    }
}
