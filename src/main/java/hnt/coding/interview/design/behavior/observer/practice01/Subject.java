package hnt.coding.interview.design.behavior.observer.practice01;

/**
 * Methods add/remove observer object (app will be notified)
 * Method notify
 *
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
