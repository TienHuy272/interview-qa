package hnt.coding.interview.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockLockExample {

    // Khởi tạo hai đối tượng Lock
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    // Task 1 cố gắng chiếm lock1 rồi lock2
    Runnable task1 = new Runnable() {
        @Override
        public void run() {
            lock1.lock();  // Chiếm lock1
                System.out.println(Thread.currentThread().getName() + ": Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println(Thread.currentThread().getName() + ": Waiting for lock 2...");
                lock2.lock();  // Cố gắng chiếm lock2
                    System.out.println(Thread.currentThread().getName() + ": Holding lock 1 & 2...");
                    lock2.unlock();  // Giải phóng lock2 sau khi hoàn thành
                lock1.unlock();  // Giải phóng lock1 sau khi hoàn thành
        }
    };

    // Task 2 cố gắng chiếm lock2 rồi lock1
    Runnable task2 = new Runnable() {
        @Override
        public void run() {
            lock2.lock();  // Chiếm lock1
            System.out.println(Thread.currentThread().getName() + ": Holding lock 2...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println(Thread.currentThread().getName() + ": Waiting for lock 1...");
            lock1.lock();  // Cố gắng chiếm lock2
            System.out.println(Thread.currentThread().getName() + ": Holding lock 1 & 2...");
            lock1.unlock();  // Giải phóng lock2 sau khi hoàn thành
            lock2.unlock();  // Giải phóng lock1 sau khi hoàn thành
        }
    };

    public static void main(String[] args) {
        DeadlockLockExample example = new DeadlockLockExample();

        // Tạo ExecutorService với 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Thực hiện hai tác vụ dẫn đến deadlock bằng execute()
        executor.execute(example.task1); // Task 1 chiếm lock1 trước
        executor.execute(example.task2); // Task 2 chiếm lock2 trước

        // Đóng ExecutorService (không chấp nhận thêm tác vụ mới)
        executor.shutdown();
    }
}