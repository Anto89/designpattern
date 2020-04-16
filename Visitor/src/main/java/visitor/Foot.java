package visitor;

public class Foot implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}