/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.consumer;

import io.github.phuduongdev.designpattern.entity.computer.Computer;
import io.github.phuduongdev.designpattern.director.ComputerDirector;
import io.github.phuduongdev.designpattern.factory.PCFactory;
import io.github.phuduongdev.designpattern.factory.ServerFactory;

/**
 *
 * @author phudev
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        doTestAF();
    }

    private static void doTestAF() {
        Computer pc = ComputerDirector.getComputer(new PCFactory("2GB", "500GB", "2.4 GHz"));
        Computer server = ComputerDirector.getComputer(new ServerFactory("8GB", "10TB", "3.2 GHz"));
        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory Server Config: " + server);
    }
}
