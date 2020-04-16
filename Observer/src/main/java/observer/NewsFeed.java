package observer;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class NewsFeed implements Observable {
    private List<Observer> subscribers = new ArrayList<>();

    public void addSubscription(Observer observer) {
        this.subscribers.add(observer);
    }

    public void publishNews(String news) {
        System.out.println(format("A new article related to %s is available !", news));
        subscribers.forEach(observer -> observer.update(news));
    }
}
