package main;

import javax.swing.*;

public abstract class Entity extends BLabel {

    private Coordinate loc;
    private Velocity velocity;

    public Entity(int frameWidth, int frameHeight) {
        super(frameWidth, frameHeight);
        loc = new Coordinate(0, 0);
        velocity = new Velocity(0, 0);

    }

    public void updateLoc() {
        loc.moveV(velocity);

    }

    public void updateGraphics(Coordinate playerLoc) {
        setBounds((int)(loc.getX() - playerLoc.getX()), (int)(loc.getY() - playerLoc.getY()), getWidth(), getHeight());

    }

    public Velocity getVelocity() {
        return velocity;

    }

}
