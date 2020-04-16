package visitor;

public class Client {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.addElement(new Head());
        robot.addElement(new Body());
        robot.addElement(new Foot());
        robot.addElement(new Foot());

        robot.accept(new CostVisitor());
        robot.accept(new DisplayVisitor());
    }
}
