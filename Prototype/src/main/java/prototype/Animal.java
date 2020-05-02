package prototype;

public abstract class Animal {
    private final int age;
    private String nom;
    private Information information;

    public Animal(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public abstract Animal copy();

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}
