package game.entity.enemy;

import game.entity.Entity;
import types.code.Coordinate;
import types.code.Velocity;

import javax.swing.*;

public class Enemy extends Entity {

    public Enemy(JComponent game) {
        super(game);
        setIcon(new ImageIcon("src/files/blue circle.png"));
        setSize(700, 700);
        setBounds(0, 0);
    }

    protected void move(Coordinate loc, Velocity vel) {
        loc.moveV(vel);
    }

}
