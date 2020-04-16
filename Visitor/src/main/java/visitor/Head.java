package visitor;

public class Head implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
