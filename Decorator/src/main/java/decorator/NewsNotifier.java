package decorator;

public class NewsNotifier implements Notifier {
    private String news;

    public NewsNotifier(String news) {
        this.news = news;
    }

    @Override
    public String notifyTopic() {
        return news;
    }
}
