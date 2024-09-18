package hnt.coding.interview.design.structure.decorator.condiment;

import hnt.coding.interview.design.structure.decorator.IMilkTea;
import hnt.coding.interview.design.structure.decorator.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 2.5D + super.cost();
    }
}
