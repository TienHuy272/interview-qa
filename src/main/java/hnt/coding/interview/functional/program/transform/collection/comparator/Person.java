package hnt.coding.interview.functional.program.transform.collection.comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private final String name;
    private final int age;

    public int ageDiff(final Person other) {
        return this.age - other.age;
    }

}
