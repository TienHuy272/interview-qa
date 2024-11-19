package hnt.coding.interview.core.functional.inteface;

@FunctionalInterface
public interface Operation <T> {
    T calculate(T v1, T v2);
}
