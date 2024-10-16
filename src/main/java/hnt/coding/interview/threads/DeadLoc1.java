package hnt.coding.interview.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLoc1 implements Runnable{
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public DeadLoc1(Lock lock1, Lock lock2) {
        this.lock1.lock();
        this.lock2.lock();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "LOck 2");
        lock2.lock();
        System.out.println(Thread.currentThread().getName() + "LOck 1");
        lock1.lock();
        lock2.unlock();
        lock1.unlock();
    }
}
