package hnt.coding.interview.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();


        Runnable r1 = new DeadLock(lock1, lock2);
        Runnable r2 = new DeadLoc1(lock1, lock2);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
