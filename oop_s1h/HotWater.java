package oop_s1h;

public class HotWater extends Water {
    private Integer temperature;

    public HotWater(String name, Double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
}