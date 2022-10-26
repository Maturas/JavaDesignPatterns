package org.example.DesignPatterns.ConstructionalPatterns.Builder;

/*
    This is a ComputerBuilder class, which is used to pass parameters to the Computer class.
    With the use of setter methods, that always return the same instance, it is possible to use convenient method chaining.
 */
public class ComputerBuilder {
    private String cpu;
    private String gpu;
    private String motherBoard;
    private Integer ram;
    private Integer diskSpace;
    private Integer powerSupplyWattage;

    public static void example() {
        ComputerBuilder builder = newComputer()
                .withCPU("Intel Core i9 12900K")
                .withGPU("RTX 4090")
                .withRam(128)
                .withDiskSpace(2048)
                .withPowerSupplyWattage(1000);

        Computer computer = new Computer(builder);
    }

    public static ComputerBuilder newComputer() {
        return new ComputerBuilder();
    }

    public ComputerBuilder withCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder withGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder withMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public ComputerBuilder withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder withDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
        return this;
    }

    public ComputerBuilder withPowerSupplyWattage(Integer powerSupplyWattage) {
        this.powerSupplyWattage = powerSupplyWattage;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public Integer getPowerSupplyWattage() {
        return powerSupplyWattage;
    }
}
