package hnt.coding.interview.design.structure.decorator.condiment;

import hnt.coding.interview.design.structure.decorator.MilkTea;
import hnt.coding.interview.design.structure.decorator.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

    public BlackSugar(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double cost() {
        return 3D + super.cost();
    }
}
