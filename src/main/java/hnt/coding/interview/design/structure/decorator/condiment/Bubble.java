package hnt.coding.interview.design.structure.decorator.condiment;

import hnt.coding.interview.design.structure.decorator.IMilkTea;
import hnt.coding.interview.design.structure.decorator.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1D + super.cost();
    }

}
