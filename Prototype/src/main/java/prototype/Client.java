package prototype;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String... args) throws CloneNotSupportedException {
        System.out.println("Via Cloneable");

        DogViaCloneable medor = new DogViaCloneable("médor", 5, new Information());
        DogViaCloneable rex = (DogViaCloneable) medor.clone();
        System.out.println(medor);
        System.out.println(medor.getAge());
        System.out.println(medor.getInformation());
        System.out.println(rex);
        System.out.println(rex.getAge());
        System.out.println(rex.getInformation());

        System.out.println("Via Custom Copy");
        Cat felix = new Cat(3, "Félix");
        felix.setInformation(new Information());
        Dog milou = new Dog(5, "Milou");
        milou.setInformation(new Information());
        List<Animal> animals = Arrays.asList(felix, milou);

        animals.stream().map(Animal::copy)
                .forEach(animal -> {
                    System.out.println(animal.getNom());
                    System.out.println(animal.getAge());
                    System.out.println(animal.getInformation());
                });
    }
}
