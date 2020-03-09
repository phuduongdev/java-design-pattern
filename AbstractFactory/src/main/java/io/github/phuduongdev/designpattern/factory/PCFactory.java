package io.github.phuduongdev.designpattern.factory;

import io.github.phuduongdev.designpattern.abstractfactory.ComputerAbstractFactory;
import io.github.phuduongdev.designpattern.entity.computer.Computer;
import io.github.phuduongdev.designpattern.entity.computer.PC;

/**
 *
 * @author phudev
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }

}
