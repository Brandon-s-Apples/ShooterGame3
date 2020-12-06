package main.entity;

import main.Main;
import main.coordinatePlane.Coordinate;
import main.coordinatePlane.Velocity;

import javax.swing.*;
import java.awt.*;

public abstract class Entity extends JLabel {

    public static final int width = 250, height = 250;

    private Coordinate location;
    private Velocity velocity;

    public Entity(Coordinate location) {
        this.location = new Coordinate(location);

    }

    public abstract void update();
    public abstract void paintComponent(Graphics graphics);

    void move() {
        location.move(velocity);

    }

    public void addVelocity(Velocity velocity) {
        velocity.addVelocity(velocity);

    }

    public void setMaxSpeed(double speed) {
        velocity.setMaxSpeed(speed);

    }

    public void removeMaxSpeed() {
        velocity.removeMaxSpeed();

    }

    public void setBounds() {
        setBounds(location.getIntX() + (Main.windowWidth / 2) - (width / 2), -location.getIntY() + (Main.windowHeight / 2) - (height / 2), width, height);

    }

    public void setBounds(int xOffset, int yOffset) {
        int wantedXLoc = location.getIntX() + (Main.windowWidth / 2) - (width / 2) + xOffset;
        int wantedYLoc = -location.getIntY() + (Main.windowHeight / 2) - (height / 2) - yOffset;
        setBounds(wantedXLoc, wantedYLoc, width, height);

    }

}
