package hnt.coding.interview.concurrency.ex1;

import lombok.Getter;
import lombok.Setter;

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
}
