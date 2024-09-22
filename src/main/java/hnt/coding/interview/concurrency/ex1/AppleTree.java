package hnt.coding.interview.concurrency.ex1;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
public class AppleTree {
    private final String treeLabel;
    private final int numberOfApple;

    public static AppleTree[] newTreeGarden(int size) {
        AppleTree[] appleTrees = new AppleTree[size];
        for (int i = 0; i < appleTrees.length; i++) {
            appleTrees[i] = new AppleTree("\uD83C\uDF33" + i);
        }
        return appleTrees;
    }

    public AppleTree(String treeLabel) {
        this.treeLabel = treeLabel;
        this.numberOfApple = 3;
    }

    public int pickApples(String workerName) {
        try {
            System.out.printf("%s start pick apples from %s \n", workerName, treeLabel);
            TimeUnit.SECONDS.sleep(1);
            System.out.printf("%s finish pick %s \uD83C\uDF4E from %s \n", workerName, numberOfApple, treeLabel);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return numberOfApple;
    }

    public int pickApples() {
        return pickApples(toLabel(Thread.currentThread().getName()));
    }

    private String toLabel(String threadName) {
        HashMap<String, String> threadNameToLabel = new HashMap<>();
        threadNameToLabel.put("ForkJoinPool-1-worker-1", "Alice");
        threadNameToLabel.put("ForkJoinPool-1-worker-2", "Bob");
        threadNameToLabel.put("ForkJoinPool-1-worker-3", "Carol");
        threadNameToLabel.put("ForkJoinPool-1-worker-4", "Dan");

        return threadNameToLabel.getOrDefault(threadName, threadName);
    }
}
