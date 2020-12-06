package main.entity;

import main.coordinatePlane.Coordinate;

import java.awt.*;

public class Player extends Entity {

    public Player(Coordinate location) {
        super(location);

    }

    public void update() {
        move();

    }

    public void paintComponent(Graphics graphics) {
        graphics.fillOval(0, 0, width, height);

    }

}
