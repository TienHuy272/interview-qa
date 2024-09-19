package hnt.coding.interview.design.behavior.observer;

/**
 * LIke a subscriber
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
