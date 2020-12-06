package main;

import main.coordinatePlane.Coordinate;
import main.coordinatePlane.Velocity;

import javax.swing.*;

public abstract class Entity extends JLabel {

    public static final int width = 250, height = 250;

    private Coordinate location;
    private Velocity velocity;

    public Entity(Coordinate location) {
        this.location = new Coordinate(location);

    }

    public abstract void update();

    public void move() {
        location.move(velocity);

    }

    public void setBounds() {
        setBounds(location.getIntX() + (Main.windowWidth / 2) - (width / 2), -location.getIntY() + (Main.windowHeight / 2) - (height / 2), width, height);

    }

}
