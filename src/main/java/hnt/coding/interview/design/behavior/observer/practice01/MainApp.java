package hnt.coding.interview.design.behavior.observer.practice01;

public class MainApp {
    public static void main(String[] args) {
        AppData appData = new AppData();

        // init observer need to be notified when data change
        Observer app1 = new FirstObserver();
        Observer app2 = new SecondObserver();
        Observer app3 = new ThirdObserver();

        appData.registerObserver(app1);
        appData.registerObserver(app2);

        appData.setUpdatedField("version1");

        appData.setUpdatedField("version2");


    }
}
