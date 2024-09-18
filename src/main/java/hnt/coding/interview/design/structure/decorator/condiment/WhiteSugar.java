package hnt.coding.interview.design.structure.decorator.condiment;

import hnt.coding.interview.design.structure.decorator.IMilkTea;
import hnt.coding.interview.design.structure.decorator.MilkTeaDecorator;

public class WhiteSugar extends MilkTeaDecorator {
    public WhiteSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 0.5D + super.cost();
    }
}
