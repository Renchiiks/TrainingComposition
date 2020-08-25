package com.company;

public class Lamp {
    private String name;
    private String manufacturer;
    private int lumens;

    public Lamp(String name, String manufacturer, int lumens) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.lumens = lumens;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLumens() {
        return lumens;
    }

    public void turnOn(){
        System.out.println("Lamp is on");
    }
}
