package hnt.coding.interview.design.behavior.observer.practice01;

public class SecondObserver implements Observer {

    private String fieldItem;

    @Override
    public void update(String updatedField) {
        this.fieldItem = updatedField;
        this.display();
    }

    public void display() {
        System.out.println("App2 update with value " + this.fieldItem);
    }
}
