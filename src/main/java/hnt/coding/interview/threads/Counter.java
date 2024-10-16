package hnt.coding.interview.threads;

class Counter {
    private volatile int counter = 0;

    public void increment() {
        System.out.println("COunt " + Thread.currentThread().getName()  + ": "+ counter);
        if (this.counter == 10) {
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
