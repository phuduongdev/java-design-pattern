/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.singleton.test;

import io.github.phuduongdev.designpattern.singleton.SerializedSingleton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author phudev
 */
public class SerializedSingletonTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        output.writeObject(instanceOne);
        output.close();

        ObjectInput input = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) input.readObject();
        input.close();

        System.out.println("+++++++++++++ Instance one hashcode=" + instanceOne.hashCode());
        System.out.println("+++++++++++++ Instance two hashcode=" + instanceTwo.hashCode());
    }

}
