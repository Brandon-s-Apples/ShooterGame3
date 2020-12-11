package main;

import javax.swing.*;

public class Player extends BLabel {

    private ImageIcon appleImageIcon = new ImageIcon("D:/Pictures/apple.png");
    private Coordinate playerLoc;

    public Player() {
        setIcon(appleImageIcon);
        setBounds(0, 0, appleImageIcon.getIconWidth(), appleImageIcon.getIconHeight());
        playerLoc = new Coordinate(0, 0);

    }

    public void update() {
        if(Keyboard.getKey(Keyboard.w)) playerLoc.moveAD(0, 10);
        if(Keyboard.getKey(Keyboard.a)) playerLoc.moveAD(270, 10);
        if(Keyboard.getKey(Keyboard.s)) playerLoc.moveAD(180, 10);
        if(Keyboard.getKey(Keyboard.d)) playerLoc.moveAD(90, 10);

    }

    public void updateGraphics() {


    }

    public Coordinate getPlayerLoc() {
        return playerLoc;

    }

}
