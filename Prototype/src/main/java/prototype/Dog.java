package prototype;

public class Dog extends Animal {
    public Dog(int age, String nom) {
        super(age, nom);
    }

    @Override
    public Animal copy() {
        return new Dog(1, this.getNom());
    }
}
