package main;

import javax.swing.*;

public class Player extends BLabel {

    private ImageIcon appleImageIcon = new ImageIcon("D:/Pictures/apple.png");
    private Coordinate playerLoc;
    private Velocity playerVel;

    public Player() {
        setIcon(appleImageIcon);
        setBounds(0, 0, appleImageIcon.getIconWidth(), appleImageIcon.getIconHeight());
        playerLoc = new Coordinate(0, 0);
        playerVel = new Velocity(0, 0, 10);

    }

    public void update() {
        if(Keyboard.getKey(Keyboard.w)) playerVel.addAD(0, 1);
        if(Keyboard.getKey(Keyboard.a)) playerVel.addAD(270, 1);
        if(Keyboard.getKey(Keyboard.s)) playerVel.addAD(180, 1);
        if(Keyboard.getKey(Keyboard.d)) playerVel.addAD(90, 1);

        playerLoc.moveV(playerVel);

    }

    public void updateGraphics() {


    }

    public Coordinate getPlayerLoc() {
        return playerLoc;

    }

}
