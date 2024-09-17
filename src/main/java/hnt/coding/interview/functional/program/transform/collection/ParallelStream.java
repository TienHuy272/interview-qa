package hnt.coding.interview.functional.program.transform.collection;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Process elements sequentially
//        List<Integer> squaredNumbers1 = numbers.stream()
//                .map(n -> {
//                    System.out.println("Processing " + n + " in thread " + Thread.currentThread().getName());
//                    return n * n;
//                })
//                .collect(Collectors.toList());
//
//        System.out.println("Squared Numbers: " + squaredNumbers1);

        // Process elements in parallel
        List<Integer> squaredNumbers2 = numbers.parallelStream()
                .map(n -> {
                    System.out.println("Processing " + n + " in thread " + Thread.currentThread().getName());
                    return n * n;
                })
                .collect(Collectors.toList());

        System.out.println("Squared Numbers: " + squaredNumbers2);

    }
}
