package main;

import javax.swing.*;

public class Slime extends Entity {

    public Slime(int frameWidth, int frameHeight) {
        super(frameWidth, frameHeight);
        setIcon(new ImageIcon("D:/Pictures/apple.png"));
        setBounds(0, 0, 626, 626);

    }

    public void update() {
        getVelocity().addAD(135, 0.01);

        updateLoc();

    }

}
