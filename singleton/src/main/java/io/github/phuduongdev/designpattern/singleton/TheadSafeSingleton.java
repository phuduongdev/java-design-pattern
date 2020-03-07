package io.github.phuduongdev.designpattern.singleton;

/**
 *
 * @author phudev
 */
public class TheadSafeSingleton {

    private static TheadSafeSingleton instance;

    private TheadSafeSingleton() {
    }

    // normal init
    public static synchronized TheadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new TheadSafeSingleton();
        }
        return instance;
    }

    // use double checked locking principle
    public static TheadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
        if (instance == null) {
            synchronized (TheadSafeSingleton.class) {
                if (instance == null) {
                    instance = new TheadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
