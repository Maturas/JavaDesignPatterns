package org.example.DesignPatterns.ConstructionalPatterns.Builder;

/*
    This is a class that has multiple values to be set. Using a constructor with all of these parameters would be inconvenient.
 */
public class Computer {
    private String cpu;
    private String gpu;
    private String motherBoard;
    private Integer ram;
    private Integer diskSpace;
    private Integer powerSupplyWattage;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.getCpu();
        this.gpu = builder.getGpu();
        this.motherBoard = builder.getMotherBoard();
        this.ram = builder.getRam();
        this.diskSpace = builder.getDiskSpace();
        this.powerSupplyWattage = builder.getPowerSupplyWattage();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Integer getPowerSupplyWattage() {
        return powerSupplyWattage;
    }

    public void setPowerSupplyWattage(Integer powerSupplyWattage) {
        this.powerSupplyWattage = powerSupplyWattage;
    }
}
