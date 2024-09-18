package hnt.coding.interview.design.structure.decorator.condiment;

import hnt.coding.interview.design.structure.decorator.IMilkTea;
import hnt.coding.interview.design.structure.decorator.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1.5D + super.cost();
    }
}
