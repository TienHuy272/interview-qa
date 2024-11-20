package hnt.coding.interview.immutable;

public class App {
    public static void main(String[] args) throws InterruptedException {
        MutableCounter counter = new MutableCounter();
        ImmutableCounter immutableCounter = new ImmutableCounter(0);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Kết quả không phải lúc nào cũng là 2000!
        System.out.println("Final count: " + counter.getCount());



        ImmutableCounter initialCounter = new ImmutableCounter(0);

        // Mảng để lưu trạng thái của counter trong các luồng
        ImmutableCounter[] sharedCounter = {initialCounter};

        // Tạo 2 luồng, mỗi luồng tăng giá trị 1000 lần
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (sharedCounter) {
                    sharedCounter[0] = sharedCounter[0].increment();
                }
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (sharedCounter) {
                    sharedCounter[0] = sharedCounter[0].increment();
                }
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final count: " + sharedCounter[0].getCount());
    }
}
