/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.singleton;

import java.io.Serializable;

/**
 *
 * @author phudev
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -539549359435L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {

        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
