package prototype;

public class Cat extends Animal {
    public Cat(int age, String nom) {
        super(age, nom);
    }

    @Override
    public Animal copy() {
        return new Cat(1, this.getNom());
    }
}
