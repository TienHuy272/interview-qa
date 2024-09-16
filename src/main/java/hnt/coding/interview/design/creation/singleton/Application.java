package hnt.coding.interview.design.creation.singleton;

public class Application {
    public static void main(String[] args) {
        LazyInitializedSingleton object1 = LazyInitializedSingleton.getInstance();
        object1.setField2(1);
        object1.setField1("Field1");

        System.out.println("Object1:" + object1);

        LazyInitializedSingleton object2 = LazyInitializedSingleton.getInstance();
        object2.setField2(2);
        object2.setField1("Field2");
        System.out.println("Object2:" + object2);
        System.out.println("Object1" + object1);

        //only one object will be generated
        System.out.println(object1 == object2);
    }
}
