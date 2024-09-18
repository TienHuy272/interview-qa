package hnt.coding.interview.design.structure.adapter.handon;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey fly in short distance");
    }
}
