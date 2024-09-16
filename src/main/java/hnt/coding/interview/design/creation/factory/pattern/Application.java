package hnt.coding.interview.design.creation.factory.pattern;

public class Application {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}
