package visitor;

public interface Visitor {
    void visit(Head head);

    void visit(Body body);

    void visit(Foot foot);

    void visit(Robot robot);
}
