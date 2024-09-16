package hnt.coding.interview.design.creation.ab.factory;

public class TwoLegAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(String type) {
        if (type.equals("duck")) {
            return new Duck();
        } else if (type.equals("chicken")) {
            return new Chicken();
        }
        return null;
    }
}
