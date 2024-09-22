package hnt.coding.interview.concurrency.join.fork;

import hnt.coding.interview.concurrency.ex1.AppleTree;

import java.util.concurrent.ForkJoinPool;

public class Application {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        PickFruitTask task = new PickFruitTask(appleTrees, 0, appleTrees.length - 1);
        int result = forkJoinPool.invoke(task);
        System.out.println();
        System.out.println("Total Apple picked : " + result);
    }


}
