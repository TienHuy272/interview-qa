package hnt.coding.interview.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock implements Runnable{
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public DeadLock(Lock lock1, Lock lock2) {
        this.lock1.lock();
        this.lock2.lock();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "LOck 1");
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + "LOck 2");
        lock2.lock();
        lock1.unlock();
        lock2.unlock();
    }
}
