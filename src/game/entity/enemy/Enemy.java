package game.entity.enemy;

import game.entity.Entity;
import inputs.Constants;
import methods.BMath;
import types.code.Coordinate;
import types.code.Velocity;

import javax.swing.*;

public class Enemy extends Entity {

    private Coordinate targetLoc;

    public Enemy(JComponent game) {
        super(game);
        setIcon(new ImageIcon("src/files/blue circle.png"));
        setSize(700, 700);
        setBounds(0, 0);
        targetLoc = getLoc();
        setMaxVel(Constants.enemyMaxSpeed);
    }

    protected void move(Coordinate loc, Velocity vel) {
        if(targetLoc.getX() != loc.getX() && targetLoc.getY() != loc.getY()) vel.addAD(BMath.angleTo(loc, targetLoc), Constants.enemyAcceleration);
        loc.moveV(vel);
    }

    public void setTargetLoc(Coordinate loc) {
        targetLoc = loc;
    }

}
