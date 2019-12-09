package ru.cowary;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SpaceShipFactory {
    static Map<String, SpaceShipInterface> spaceShipTypeMap = new HashMap<>();

    public static SpaceShipInterface getSpaceShipType(String name, Color color, String data){
        SpaceShipInterface spaceShipType = spaceShipTypeMap.get(name);
        if(spaceShipType == null){
            System.out.println("null");
            spaceShipType = new StarfighterType(name, color, data);
            spaceShipTypeMap.put(name, spaceShipType);
        }
        return spaceShipType;
    }
}
