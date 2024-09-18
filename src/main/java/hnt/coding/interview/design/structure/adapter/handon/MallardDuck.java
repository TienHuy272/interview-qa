package hnt.coding.interview.design.structure.adapter.handon;

public class MallardDuck implements Duck{
    @Override
    public void quark() {
        System.out.println("Mallard Duck speak...");
    }

    @Override
    public void fly(int distance) {
        System.out.println("Mallard Duck flying distance: " + distance);
    }

}
