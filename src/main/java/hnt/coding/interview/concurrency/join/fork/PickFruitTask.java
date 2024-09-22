package hnt.coding.interview.concurrency.join.fork;

import hnt.coding.interview.concurrency.ex1.AppleTree;

import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class PickFruitTask extends RecursiveTask<Integer> {
    private AppleTree[] appleTrees;
    private int startInclusive;
    private int endExclusive;
    private int taskThreadshold = 4;

    public PickFruitTask(AppleTree[] appleTrees, int startInclusive, int endExclusive) {
        this.appleTrees = appleTrees;
        this.startInclusive = startInclusive;
        this.endExclusive = endExclusive;
    }

    protected Integer doCompute() {
        System.out.println("startInclusive : " + startInclusive + " endExclusive : " + endExclusive);
        return IntStream.rangeClosed(startInclusive, endExclusive)
                .map(i -> appleTrees[i].pickApples())
                .sum();
    }

    @Override
    protected Integer compute() {
        if (endExclusive - startInclusive < taskThreadshold) {
            return doCompute();
        }
        int midPoint = startInclusive + (endExclusive - startInclusive) / 2;
        PickFruitTask leftSum = new PickFruitTask(appleTrees, startInclusive, midPoint);
        PickFruitTask rightSum = new PickFruitTask(appleTrees, midPoint + 1, endExclusive);
        rightSum.fork();
        return leftSum.compute() + rightSum.join();
    }
}
