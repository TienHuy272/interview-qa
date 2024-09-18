package hnt.coding.interview.design.structure.decorator;

import hnt.coding.interview.design.structure.decorator.condiment.Bubble;
import hnt.coding.interview.design.structure.decorator.condiment.EggPudding;
import hnt.coding.interview.design.structure.decorator.condiment.FruitPudding;
import hnt.coding.interview.design.structure.decorator.condiment.WhiteSugar;

public class Application {
    public static void main(String[] args) {
        IMilkTea milkTea = new MilkTea();

        System.out.println("Milk Tea: " + milkTea.cost());

        //add bubble , white sugar
        milkTea = new Bubble(milkTea); //add bubble
        milkTea = new WhiteSugar(milkTea); //add white sugar
        System.out.println("MilkTea with bubble and white sugar cost: " + milkTea.cost());

        //one bubble, two eggs and two fruit padding
        IMilkTea newOrder = new MilkTea();
        newOrder = new Bubble(newOrder);
        newOrder = new EggPudding(newOrder);
        newOrder = new EggPudding(newOrder);
        newOrder = new FruitPudding(newOrder);
        newOrder = new FruitPudding(newOrder);
        System.out.println("MilkTea-Bubble-TwoEgg-TwoFruitPudding cost: " + newOrder.cost());

    }
}
