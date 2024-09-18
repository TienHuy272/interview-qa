package hnt.coding.interview.design.structure.adapter.handon;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey); //make turkey look like a duck
        testDuck(adapter);
    }


    /**
     * This  legacy function of interface only accept input as Duck
     * @param duck
     */
    public static void testDuck(Duck duck) {
        duck.quark();
        duck.fly(999);
    }
}
