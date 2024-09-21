package hnt.coding.interview.concurrency.ex1;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

import static java.util.Arrays.asList;

public class Application {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(6);
        Callable<Void> picker1 = createPicker(appleTrees, 0, 2, "Alex");
        Callable<Void> picker2 = createPicker(appleTrees, 2, 4, "Bob");
        Callable<Void> picker3 = createPicker(appleTrees, 4, 6, "Carol");
        ForkJoinPool.commonPool().invokeAll(asList(picker1, picker2, picker3));

    }

    public static Callable<Void> createPicker(AppleTree[] appleTrees,
                                       int fromIndexInclusive,
                                       int toIndexExclusive,
                                       String workerName) {
        return () -> {
            for (int i = fromIndexInclusive; i < toIndexExclusive; i++) {
                appleTrees[i].pickApples(workerName);
            }
            return null;
        };
    }
}
