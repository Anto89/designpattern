package chainofresponsability;

public class Support1 extends BaseHandler {
    public Support1(Handler successor) {
        super(successor);
    }

    public String handle(RequestIssue requestIssue) {
        if (requestIssue.getType() == RequestIssue.Type.FUNCTIONNAL) {
            return "Hi, here team support 1, this what should do.";
        }
        return nextHandle(requestIssue);
    }
}
