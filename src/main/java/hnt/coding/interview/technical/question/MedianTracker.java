package hnt.coding.interview.technical.question;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianTracker {
    // Max-Heap to store the smaller half of numbers
    private PriorityQueue<Integer> maxHeap;
    // Min-Heap to store the larger half of numbers
    private PriorityQueue<Integer> minHeap;

    public MedianTracker() {
        // Max-Heap should have largest element on top, so we use Collections.reverseOrder
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Min-Heap is a regular priority queue (smallest element on top)
        minHeap = new PriorityQueue<>();
    }

    // Add a number to the data structure
    public void addNumber(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);  // Add to maxHeap if smaller or equal to the max in maxHeap
        } else {
            minHeap.offer(num);  // Otherwise add to minHeap
        }

        // Balance the heaps to make sure their sizes differ by at most 1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    // Get the current median
    public double getMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();  // Max-Heap has more elements, median is top of maxHeap
        } else {
            // Both heaps are balanced, so median is average of tops of both heaps
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianTracker tracker = new MedianTracker();

        int[] numbers = {5, 10, 1, 3, 2, 8, 7};
        for (int num : numbers) {
            tracker.addNumber(num);
            System.out.println("Added: " + num + ", Current Median: " + tracker.getMedian());
        }
    }
}

