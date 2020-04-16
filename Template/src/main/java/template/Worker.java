package template;

public abstract class Worker {
    void dailyRoutine() {
        work();
        relax();
    }

    abstract void work();

    void relax() {
        System.out.println("Chillin on the sofa");
    }
}
