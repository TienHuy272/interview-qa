package hnt.coding.interview.design.creation.singleton;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LazyInitializedSingleton {

    private String field1;
    private Integer field2;

    public static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){
    }

    public static LazyInitializedSingleton getInstance(){
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
