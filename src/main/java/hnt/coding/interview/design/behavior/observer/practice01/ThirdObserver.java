package hnt.coding.interview.design.behavior.observer.practice01;

public class ThirdObserver implements Observer {

    private String fieldItem;

    @Override
    public void update(String updatedField) {
        this.fieldItem = updatedField;
        this.display();
    }

    public void display() {
        System.out.println("App3 update with value " + this.fieldItem);
    }
}
