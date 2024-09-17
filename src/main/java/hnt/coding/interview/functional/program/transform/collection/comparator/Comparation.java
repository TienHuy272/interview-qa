package hnt.coding.interview.functional.program.transform.collection.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparation {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("Messi", 20),
                new Person("Ronaldo", 21),
                new Person("Kaka", 22),
                new Person("Henry", 23)
        );

        Comparator<Person> compareAscending = (p1, p2) -> p1.ageDiff(p2);
        Comparator<Person> comparedescending = compareAscending.reversed();

        System.out.println("People Descending" + people.stream().sorted(comparedescending).toList());
        System.out.println("People Ascending" + people.stream().sorted(compareAscending).toList());

        people.stream()
 	      .min(Person::ageDiff)
 	      .ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        people.stream()
                .max(Person::ageDiff)
                .ifPresent(oldest -> System.out.println("Oldest: " + oldest));
    }
}
