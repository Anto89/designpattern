package chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    void shouldBeHandledBySupport1() {
        RequestIssue functionnalIssue = new RequestIssue(RequestIssue.Type.FUNCTIONNAL, 0);
        String result = Client.solve(functionnalIssue);
        assertEquals("Hi, here team support 1, this what should do.", result);
    }

    @Test
    void shouldBeHandledBySupport2() {
        RequestIssue easyIssue = new RequestIssue(RequestIssue.Type.TECHNICAL, 10);
        String result = Client.solve(easyIssue);
        assertEquals("Hi, your problem does'nt look to difficult to solve, team support 2 have this.", result);
    }

    @Test
    void shouldBeHandledBySupport3() {
        RequestIssue complexIssue = new RequestIssue(RequestIssue.Type.TECHNICAL, 100);
        String result = Client.solve(complexIssue);
        assertEquals("Hmm ... not that easy but it should be fine.", result);
    }

    @Test
    void shouldBeLeftUnresolved() {
        RequestIssue unsolvableIssue = new RequestIssue(RequestIssue.Type.OTHER, 0);
        String result = Client.solve(unsolvableIssue);
        assertEquals("Sorry, nobody can help :(", result);
    }
}