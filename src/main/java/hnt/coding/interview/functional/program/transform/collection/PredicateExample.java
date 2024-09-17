package hnt.coding.interview.functional.program.transform.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike", "Sara");

        Predicate<String> startWithN = startWithX("S");

        final long countFriendsStartN = friends.stream().filter(startWithN).count();
        System.out.println(countFriendsStartN);
        final long countEditorsStartE = editors.stream().filter(startWithN).count();
        System.out.println(countEditorsStartE);
    }

    public static Predicate<String> startWithX(String x) {
        Predicate<String> startWithX;
        startWithX = item -> item.startsWith(x);
        return startWithX;
    }
}
