package hnt.coding.interview.design.creation.factory.pattern;

public class AnimalFactory {
    public static Animal createAnimal(String animalType) {
        if (animalType.equals("dog")) {
            return new Dog();
        } else if (animalType.equals("cat")) {
            return new Cat();
        } else if (animalType.equals("duck")) {
            return new Duck();
        } else if (animalType.equals("chicken")) {
            return new Chicken();
        }
        return null;
    }
}
