package com.company;

public class Wardrobe {
    private String name;
    private String manufacturer;
    private Volume volume;
    private boolean isClosed;
    private String material;
    private boolean hangar;
    private int numOfShelf;

    public Wardrobe(String name, String manufacturer, Volume volume, String material, boolean hangar, int numOfShelf) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.volume = volume;
        this.isClosed = true;
        this.material = material;
        this.hangar = hangar;
        this.numOfShelf = numOfShelf;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Volume getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isHangar() {
        return hangar;
    }

    public int getNumOfShelf() {
        return numOfShelf;
    }

    public void openWardrobe(){
        isClosed = false;
        System.out.println("Wardrobe is open");
    }


}
