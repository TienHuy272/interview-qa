package hnt.coding.interview.design.behavior.observer;

/**
 * Like a publisher
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
