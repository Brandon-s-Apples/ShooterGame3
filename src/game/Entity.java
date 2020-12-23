package game;

import inputs.Constants;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public abstract class Entity extends BLabel {

    private Coordinate loc;
    private Velocity vel;
    private Ellipse standLoc;

    public Entity(JComponent game) {
        super(game);
        loc = new Coordinate();
        vel = new Velocity();
        standLoc = new Ellipse(loc, Constants.entityDefaultStandWidth, Constants.entityDefaultStandHeight);

    }

    public void update(Coordinate playerLoc) {
        move(loc, vel);
        setBounds(playerLoc);
    }
    abstract void move(Coordinate loc, Velocity vel);

    public Coordinate getLoc() {
        return loc;
    }

    public void setMaxVel(double val) {
        vel.setMaxSpeed(val);
    }

    public void setVel(Velocity vel) {
        this.vel = vel;
    }

    public void setLoc(Coordinate loc) {
        this.loc = loc;
    }

    public void setStandWidth(double val) {
        standLoc.setWidth(val);
    }

    public void setBounds(Coordinate playerLoc) {
        setBounds(loc.getX() - playerLoc.getX(), loc.getY() - playerLoc.getY());
    }

}
