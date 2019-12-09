package ru.cowary;

import java.awt.*;

public class SpaceShip {
    private int x;
    private int y;
    private SpaceShipInterface shipType;

    public SpaceShip(int x, int y, SpaceShipInterface shipType){
        this.x = x;
        this.y = y;
        this.shipType = shipType;
    }

    public void draw(Graphics g){
        shipType.draw(g, x, y);
    }


}
