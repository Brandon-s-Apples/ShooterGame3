package main;

import javax.swing.*;

public class Bullet extends Entity {

    public Bullet(int frameWidth, int frameHeight, Velocity velocity) {
        super(frameWidth, frameHeight);
        setVelocityRef(velocity);
        setIcon(new ImageIcon("D:/Pictures/apple.png"));
        setBounds(0, 0, 626, 626);

    }

    public void update() {
        updateLoc();

    }

}
