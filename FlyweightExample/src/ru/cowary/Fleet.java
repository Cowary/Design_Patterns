package ru.cowary;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Fleet extends JFrame {
    private List<SpaceShip> spaceShipsList = new ArrayList<>();

    private List<AlienSpaceship> spaceShipsNO_FLYWEIGHT = new ArrayList<>();

    public void placeFleet(int x, int y, String name, Color color, String data){
        SpaceShipInterface spaceShipType = SpaceShipFactory.getSpaceShipType(name, color, data);
        SpaceShip spaceShip = new SpaceShip(x, y, spaceShipType);
        spaceShipsList.add(spaceShip);
    }

    public void placeFleetNO_FLYWEIGHT(int x, int y,String name, Color color, String data){
        spaceShipsNO_FLYWEIGHT.add(new AlienSpaceship(x, y, name, color, data));
    }

    @Override
    public void paint(Graphics graphics){
        for(SpaceShip spaceShip: spaceShipsList){
            spaceShip.draw(graphics);
        }
        for(AlienSpaceship alienSpaceship: spaceShipsNO_FLYWEIGHT){
            alienSpaceship.draw(graphics);
        }
    }
}
