package singleton;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Call getInstance() to get the object.");
        }

        System.out.println("Creating the singleton");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}