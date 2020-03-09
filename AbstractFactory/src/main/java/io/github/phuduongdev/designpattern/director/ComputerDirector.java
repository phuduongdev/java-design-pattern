/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.director;

import io.github.phuduongdev.designpattern.abstractfactory.ComputerAbstractFactory;
import io.github.phuduongdev.designpattern.entity.computer.Computer;

/**
 *
 * @author phudev
 */
public class ComputerDirector {

    public static Computer getComputer(ComputerAbstractFactory concreteFactory) {
        return concreteFactory.createComputer();
    }
}
