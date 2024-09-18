package hnt.coding.interview.design.structure.decorator;

public abstract class MilkTeaDecorator implements IMilkTea{

    private IMilkTea milkTea;

    protected MilkTeaDecorator(IMilkTea inner) {
        this.milkTea = inner;
    }

    public double cost() {
       return this.milkTea.cost();
    }
}
