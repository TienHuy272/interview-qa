package hnt.coding.interview.functional.program.transform.collection;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeIssue {
        private static final List<String> uppercaseNames = new ArrayList<>();

        public static void main(String[] args) {
            List<String> friends = List.of("Alice", "Bob", "Charlie");

            // Create and start multiple threads
            Thread thread1 = new Thread(() -> friends.forEach(name -> uppercaseNames.add(name.toUpperCase())));
            Thread thread2 = new Thread(() -> friends.forEach(name -> uppercaseNames.add(name.toUpperCase())));

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //uppercaseName may end up with duplicate or missing entries
            System.out.println(uppercaseNames);
    }
}
