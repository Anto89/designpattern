package prototype;

public class DogViaCloneable implements Cloneable {
    private final String name;
    private final int age;
    private final Information information;

    public DogViaCloneable(String name, int age, Information information) {
        this.name = name;
        this.age = age;
        this.information = information;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public Information getInformation() {
        return information;
    }
}
