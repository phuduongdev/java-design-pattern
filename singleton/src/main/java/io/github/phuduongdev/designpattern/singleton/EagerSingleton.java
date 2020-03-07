package io.github.phuduongdev.designpattern.singleton;

/**
 *
 * @author phudev
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
