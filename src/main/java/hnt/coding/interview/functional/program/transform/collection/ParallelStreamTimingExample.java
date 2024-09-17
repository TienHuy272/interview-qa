package hnt.coding.interview.functional.program.transform.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ParallelStreamTimingExample {
    public static void main(String[] args) {
        // Create a large list of integers
        List<Integer> largeList = LongStream.rangeClosed(1, 10_000) // 1 million elements
                .mapToObj(n -> (int) n) // Convert long to Integer
                .toList();

        // Measure time for sequential stream
        long startTimeSequential = System.currentTimeMillis();
        List<Integer> processedListSequential = largeList.stream()
                .map(n -> {
                    // Simulate a computationally intensive task
                    try {
                        Thread.sleep(1); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return n * 2; // Example transformation
                })
                .collect(Collectors.toList());
        long endTimeSequential = System.currentTimeMillis();
        long durationSequential = endTimeSequential - startTimeSequential;

        // Measure time for parallel stream
        long startTimeParallel = System.currentTimeMillis();
        List<Integer> processedListParallel = largeList.parallelStream()
                .map(n -> {
                    // Simulate a computationally intensive task
                    try {
                        Thread.sleep(1); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return n * 2; // Example transformation
                })
                .collect(Collectors.toList());
        long endTimeParallel = System.currentTimeMillis();
        long durationParallel = endTimeParallel - startTimeParallel;

        // Print results
        System.out.println("Time taken with sequential stream: " + durationSequential + " ms" + processedListSequential.size());
        System.out.println("Time taken with parallel stream: " + durationParallel + " ms" + processedListParallel.size());
    }
}
