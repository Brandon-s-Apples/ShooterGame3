package main;

import javax.swing.*;

public class Entity extends BLabel {

    private ImageIcon imageIcon = new ImageIcon("D:/Pictures/blue circle.png");
    private Coordinate loc;
    private Velocity vel;

    public Entity() {
        setIcon(imageIcon);
        loc = new Coordinate(0, 500);
        vel = new Velocity(135, 6);

    }

    public void update() {
        loc.moveV(vel);

    }

    public void updateGraphics(Coordinate playerLoc) {
        int wantedX = (int)(loc.getX() - playerLoc.getX());
        int wantedY = (int)(loc.getY() - playerLoc.getY());

        setBounds(wantedX, wantedY, imageIcon.getIconWidth(), imageIcon.getIconHeight());

    }

}
