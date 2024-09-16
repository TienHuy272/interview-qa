package hnt.coding.interview.design.creation.builder;

public class Application {
    public static void main(String[] args) {
        ICarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.branchName("Madza")
                .color("red")
                .numberOfWheel(2)
                .numberOfDoor(1000)
                .build();
        System.out.println("**********^_^***********");
        System.out.println("Car was build " + car.toString());
        System.out.println("**********^_^***********");
    }
}
