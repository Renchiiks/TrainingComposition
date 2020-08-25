package com.company;

public class Bed {
    private String name;
    private String manufacturer;
    private Dimensions dimensions;
    private Mattress mattress;
    private String material;

    public Bed(String name, String manufacturer, Dimensions dimensions, Mattress mattress, String material) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.mattress = mattress;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Mattress getMattress() {
        return mattress;
    }

    public String getMaterial() {
        return material;
    }

    public void makeABad(){
        System.out.println("Make a bad");
    }
}
