package singleton;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import static java.util.Arrays.asList;

public class Client {
    public static void main(String... args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        List<Future<Object>> futures = pool.invokeAll(asList(Singleton::getInstance, Singleton::getInstance));

        futures.forEach(objectFuture -> {
            try {
                System.out.println(objectFuture.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
