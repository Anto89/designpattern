package visitor;

public class DisplayVisitor implements Visitor {
    @Override
    public void visit(Head head) {
        System.out.println("This is a head.");
    }

    @Override
    public void visit(Body body) {
        System.out.println("This is a body.");
    }

    @Override
    public void visit(Foot foot) {
        System.out.println("This is a foot.");
    }

    @Override
    public void visit(Robot robot) {
        // Nothing special here.
    }
}
