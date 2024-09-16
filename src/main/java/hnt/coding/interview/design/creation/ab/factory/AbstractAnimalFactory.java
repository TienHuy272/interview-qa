package hnt.coding.interview.design.creation.ab.factory;

public class AbstractAnimalFactory {
    public static AnimalFactory createFactory(String type){
        if(type.equalsIgnoreCase("two-legs")){
            return new TwoLegAnimalFactory();
        } else if (type.equals("four-legs")) {
            return new FourLegAnimalFactory();
        }
        return null;
    }
}
