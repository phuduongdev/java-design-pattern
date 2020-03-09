/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.demo;

import io.github.phuduongdev.designpattern.factory.ComputerFactory;
import io.github.phuduongdev.designpattern.entity.computer.Computer;

/**
 *
 * @author phudev
 */
public class ComputerFactoryTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2GB", "500GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "8GB", "10TB", "3.2 GHz");

        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory Server Config: " + server);
    }
}
