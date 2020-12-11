package main;

import javax.swing.*;

public class Entity extends BLabel {

    private ImageIcon imageIcon = new ImageIcon("D:/Pictures/blue circle.png");
    private Coordinate loc;

    public Entity() {
        setIcon(imageIcon);
        loc = new Coordinate(0, 500);

    }

    public void update() {
        loc.moveAD(135, 5);

    }

    public void updateGraphics(Coordinate playerLoc) {
        int wantedX = (int)(loc.getX() - playerLoc.getX());
        int wantedY = (int)(loc.getY() - playerLoc.getY());

        setBounds(wantedX, wantedY, imageIcon.getIconWidth(), imageIcon.getIconHeight());

    }

}
