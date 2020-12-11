package main;

import javax.swing.*;

public abstract class Entity extends BLabel {

    private ImageIcon imageIcon;
    private Coordinate loc;
    private Velocity velocity;

    public Entity() {
        loc = new Coordinate(0, 500);
        velocity = new Velocity(0, 0);

    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = new ImageIcon(imageIcon.getImage());

    }

    public void update() {
        velocity.addAD(135, 0.01);
        loc.moveV(velocity);

    }

    public void updateGraphics(Coordinate playerLoc) {
        int wantedX = (int)(loc.getX() - playerLoc.getX());
        int wantedY = (int)(loc.getY() - playerLoc.getY());

        setBounds(wantedX, wantedY, imageIcon.getIconWidth(), imageIcon.getIconHeight());

    }

}
