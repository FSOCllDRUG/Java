package s6h.model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Laptop {
    private String manufacture;
    private String operatingSystem;
    private int hardDriveSize;
    private int ramSize;
    private int dedicatedGraphicsMemory;

    public Laptop(String manufacture, String operatingSystem, int hardDriveSize, int ramSize, int dedicatedGraphicsMemory) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.hardDriveSize = hardDriveSize;
        this.ramSize = ramSize;
        this.dedicatedGraphicsMemory = dedicatedGraphicsMemory;
    }

    public Laptop() {
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getDedicatedGraphicsMemory() {
        return dedicatedGraphicsMemory;
    }

    public void setDedicatedGraphicsMemory(int dedicatedGraphicsMemory) {
        this.dedicatedGraphicsMemory = dedicatedGraphicsMemory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacture='" + manufacture + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", hardDriveSize=" + hardDriveSize +
                ", ramSize=" + ramSize +
                ", dedicatedGraphicsMemory=" + dedicatedGraphicsMemory +
                '}';
    }
}