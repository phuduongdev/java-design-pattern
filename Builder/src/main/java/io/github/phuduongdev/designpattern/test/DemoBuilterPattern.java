/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.test;

import io.github.phuduongdev.designpattern.entity.Computer;

/**
 *
 * @author phudev
 */
public class DemoBuilterPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setIsBluetoothEnabled(true)
                .setIsGraphicsCardEnabled(true)
                .build();
    }
}
