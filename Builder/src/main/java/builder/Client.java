package builder;

public class Client {
    public static void main(String... args) {
        Cocktail cocktail = new Cocktail.Builder().alcohol("rum")
                .fruit("lime")
                .sugar("cane sugar").shake();

        System.out.println("Drinking great " + cocktail + " :)");
    }
}
