package hnt.coding.interview.design.creation.builder;

import lombok.Getter;
import lombok.Setter;

public class CarBuilder implements ICarBuilder{
    public int numberOfWheel;
    public int numberOfDoor;
    public int numberOfSeat;
    public String color;
    public String branchName;

    @Override
    public CarBuilder numberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
        return this;
    }

    @Override
    public CarBuilder numberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
        return this;
    }

    @Override
    public CarBuilder numberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder branchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    @Override
    public Car build() {
        return new Car(this.numberOfWheel, this.numberOfDoor, this.numberOfSeat, this.color, this.branchName);
    }
}
