package hnt.coding.interview.threads;

public class MyRunnable implements Runnable{

    int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000_000_0; i++) {
            this.count++;

//            using synchronized
//            synchronized (this) {
//                this.count++;
//            }

        }
        System.out.println(Thread.currentThread().getName() + " count:  " + count);
    }
}
