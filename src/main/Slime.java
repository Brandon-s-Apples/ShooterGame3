package main;

import javax.swing.*;

public class Slime extends Entity {

    public enum State {
        IDLE, NOTICING, CHARGING, ATTACKING, DYING, DEAD

    }

    private ImageIcon imageIcon = new ImageIcon("D:/Pictures/blue circle.png");

    public Slime() {
        super();
        setImageIcon(imageIcon);
        setIcon(imageIcon);

    }

}
