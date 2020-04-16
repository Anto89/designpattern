package chainofresponsability;

public class Client {
    public static String solve(RequestIssue requestIssue) {
        Handler support3 = new Support3();
        Handler support2 = new Support2(support3);
        Handler support1 = new Support1(support2);

        return support1.handle(requestIssue);
    }
}
