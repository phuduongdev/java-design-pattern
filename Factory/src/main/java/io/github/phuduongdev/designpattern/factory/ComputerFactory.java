/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.phuduongdev.designpattern.factory;

import io.github.phuduongdev.designpattern.entity.computer.Computer;
import io.github.phuduongdev.designpattern.entity.computer.PC;
import io.github.phuduongdev.designpattern.entity.computer.Server;

/**
 *
 * @author phudev
 */
public class ComputerFactory {

    public static Computer getComputer(String computerType, String ram, String hdd, String cpu) {
        String option = computerType != null ? computerType.toLowerCase() : "";
        switch (option) {
            case "pc":
                return new PC(ram, hdd, cpu);
            case "server":
                return new Server(ram, hdd, cpu);
            default:
                return null;
        }
    }
}
