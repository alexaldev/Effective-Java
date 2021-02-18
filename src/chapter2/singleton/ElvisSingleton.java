package chapter2.singleton;

import java.io.Serializable;

public class ElvisSingleton implements Serializable {
    private static transient ElvisSingleton instance = new ElvisSingleton();

    public static ElvisSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public void dance() {
        System.out.println("I love dancing :;1!;");
    }

}
