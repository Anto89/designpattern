package observer;

public class Client {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addSubscription(new Agency("1"));

        newsFeed.publishNews("games");

        newsFeed.addSubscription(new Agency("2"));
        newsFeed.publishNews("movies");
    }
}
