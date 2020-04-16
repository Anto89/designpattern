package chainofresponsability;

public abstract class BaseHandler implements Handler {
    private final Handler successor;

    public BaseHandler() {
        this.successor = null;
    }

    public BaseHandler(Handler successor) {
        this.successor = successor;
    }

    public String nextHandle(RequestIssue requestIssue) {
        return successor.handle(requestIssue);
    }
}
