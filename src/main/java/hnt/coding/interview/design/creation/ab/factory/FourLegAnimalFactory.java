package hnt.coding.interview.design.creation.ab.factory;

public class FourLegAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }
}
