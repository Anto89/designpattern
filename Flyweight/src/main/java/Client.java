public class Client {
    public static void main(String... args) {
        Insectarium insectarium = new Insectarium(100000);
        insectarium.watchThem();

        System.out.println("Mémoire = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " b");
    }
}
