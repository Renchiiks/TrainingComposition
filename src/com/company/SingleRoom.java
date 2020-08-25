package com.company;

import java.util.List;

public class SingleRoom {
    private List<Wall> walls;
    private Ceiling ceiling;
    private Wardrobe wardrobe;
    private Bed bed;
    private Windows window;
    private ITable iTable;
    private Lamp lamp;

    public SingleRoom(List<Wall> walls, Ceiling ceiling, Wardrobe wardrobe, Bed bed, Windows window, ITable iTable, Lamp lamp) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.window = window;
        this.iTable = iTable;
        this.lamp = lamp;
    }

    public List getWall() {
        return walls;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Windows getWindow() {
        return window;
    }

    public ITable getITable() {
        return iTable;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public double calculateWallArea(List<Wall> walls) {
        double result = 0;
        for (Wall wall : walls) {
            double area = wall.getWallArea(wall.getDimensions());
            result += area;
        }
        System.out.println(result);
        return result;
    }
}
