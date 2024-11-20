package hnt.coding.interview.immutable;
class MutableCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}