package hnt.coding.interview.immutable;

final class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public ImmutableCounter increment() {
        // Tạo một đối tượng mới với giá trị count tăng lên
        return new ImmutableCounter(count + 1);
    }

    public int getCount() {
        return count;
    }
}
