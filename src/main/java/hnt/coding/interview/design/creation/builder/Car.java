package hnt.coding.interview.design.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    public int numberOfWheel;
    public int numberOfDoor;
    public int numberOfSeat;
    public String color;
    public String branchName;
}
