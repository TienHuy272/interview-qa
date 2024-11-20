package hnt.coding.interview.collections.equal.hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        User user1 = new User(1, "1");
        User user2 = new User(2, "1");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println("obj: " + (Objects.equals(user1, user2)));

        userSet.add(user1);
        boolean isExisted = userSet.add(user2);
        System.out.printf("isExisted %b%n", !isExisted);
        System.out.println(userSet);
    }
}
