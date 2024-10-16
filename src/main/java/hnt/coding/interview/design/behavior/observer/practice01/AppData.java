package hnt.coding.interview.design.behavior.observer.practice01;

import java.util.ArrayList;
import java.util.List;

public class AppData implements Subject {

    private String updatedField;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setUpdatedField(String updatedField) {
        this.updatedField = updatedField;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        if (this.observers.isEmpty()) {
            return;
        }
        for (Observer observer : this.observers) {
            observer.update(this.updatedField);
        }
    }
}
