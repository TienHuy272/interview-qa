package hnt.coding.interview.design.creation.ab.factory;

public class Application {
    public static void main(String[] args) {
        AnimalFactory animalFourLegFactory = AbstractAnimalFactory.createFactory("four-legs");
        Animal dog = animalFourLegFactory.createAnimal("dog");
        System.out.println(dog.getName());

        AnimalFactory animalTwoLegFactory = AbstractAnimalFactory.createFactory("two-legs");
        Animal duck = animalTwoLegFactory.createAnimal("duck");
        System.out.println(duck.getName());
    }
}
