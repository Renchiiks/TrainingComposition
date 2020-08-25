package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions1 = new Dimensions(2, 3.55);
        Dimensions dimensions2 = new Dimensions(3.55, 4.5);
        Dimensions ceilingDimensions = new Dimensions(dimensions1.getLength(), dimensions2.getLength());
        Wall wall1 = new Wall("West", dimensions1);
        Wall wall2 = new Wall("East", dimensions2);
        Wall wall3 = new Wall("South", dimensions1);
        Wall wall4 = new Wall("North", dimensions2);
        List<Wall> walls = new ArrayList<>();
        walls.add(wall1);
        walls.add(wall2);
        walls.add(wall3);
        walls.add(wall4);



        Ceiling ceiling = new Ceiling(ceilingDimensions);

        Volume wardrobeVolume = new Volume(1.5, 2, 0.60);
        Wardrobe wardrobe = new Wardrobe("Renate", "PSRS", wardrobeVolume, "wooden", true, 5);

        Dimensions bedDimensions = new Dimensions(2.05, 1.45);
        Dimensions mattressDimensions = new Dimensions(bedDimensions.getLength() - 0.05, bedDimensions.getHeight() - 0.05);
        Mattress mattress = new Mattress(mattressDimensions, 14, "foam", "springs");

        Bed bed = new Bed("Pease", "Ossov", bedDimensions, mattress, "wooden");

        Dimensions windowDimensions = new Dimensions(1.85, 1.75);

        Windows window = new Windows("Pates logi", windowDimensions, "3 layers");

        Dimensions tableDimensions = new Dimensions(1.80, 1);
        DiningTable table = new DiningTable("Dining Table", "latvijas finieris", tableDimensions, 10, true);
        //Table table = new Table("Dining Table", "latvijas finieris", tableDimensions, 10);

        Lamp lamp = new Lamp("Shiny", "Latvijas lampa", 140);

        SingleRoom bedRoom = new SingleRoom(walls, ceiling, wardrobe, bed, window, table, lamp);
        bedRoom.calculateWallArea(walls);
        bedRoom.getBed().makeABad();
        bedRoom.getLamp().turnOn();
        //table.foldTable();

        if(bedRoom.getITable() instanceof DiningTable){
            ((DiningTable)bedRoom.getITable()).foldTable();
        }
    }
}
