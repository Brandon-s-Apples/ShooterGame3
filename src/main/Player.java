package main;

import javax.swing.*;

public class Player extends BLabel {

    private ImageIcon appleImageIcon = new ImageIcon("D:/Pictures/apple.png");
    private Coordinate playerLoc;

    public Player() {
        setIcon(appleImageIcon);
        setBounds(950, 550, appleImageIcon.getIconWidth(), appleImageIcon.getIconHeight());
        playerLoc = new Coordinate(0, 0);

    }

    public Coordinate getPlayerLoc() {
        return playerLoc;

    }

}
