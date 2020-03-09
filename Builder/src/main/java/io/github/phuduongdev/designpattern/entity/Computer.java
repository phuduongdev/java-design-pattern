package io.github.phuduongdev.designpattern.entity;

/**
 *
 * @author phudev
 */
public class Computer {

    // required
    private String hdd;
    private String ram;
    // optional
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isIsGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isIsBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {

        // required
        private String hdd;
        private String ram;
        // optional
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
