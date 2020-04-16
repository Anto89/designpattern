package observer;

import static java.lang.String.format;

public class Agency implements Observer {
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(format("Hi, this is agency %s, I got this.", name));
    }
}
