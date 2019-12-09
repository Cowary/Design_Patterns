package ru.cowary;

import java.awt.*;

public class StarfighterType implements SpaceShipInterface {
    Color color;
    String name;
    String data;
    public StarfighterType(String name, Color color, String data) {
        this.name = name;
        this.color = color;
        this.data = data;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        Polygon polygon = new Polygon(new int[]{x, x+10, x},
                new int[]{y, y-5, y-10}, 3 );

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.fillPolygon(polygon);
        g2d.dispose();

    }
}
