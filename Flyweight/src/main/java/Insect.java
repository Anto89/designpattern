public class Insect {
    private InsectType insectType;

    public Insect(InsectType insectType) {
        this.insectType = insectType;
    }

    public void moveToDestination(int startingPoint, int endingPoint) {
        System.out.println(String.format("%s moving from %s -> %s", insectType, startingPoint, endingPoint));
    }
}
