package hnt.coding.interview.design.creation.builder;

public interface ICarBuilder {
    CarBuilder numberOfWheel(int numberOfWheel);
    CarBuilder numberOfDoor(int numberOfDoor);
    CarBuilder numberOfSeat(int numberOfSeat);
    CarBuilder color(String color);
    CarBuilder branchName(String branchName);

    Car build();
}
