package hnt.coding.interview.functional.program.transform.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeSolution {
    private static final List<String> uppercaseNames = new CopyOnWriteArrayList<>();
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

        System.out.println("Solution: " + uppercaseNames);
    }
}
