package game;

import inputs.Constants;
import types.code.Coordinate;
import types.code.Ellipse;
import types.code.Velocity;
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

    public void update() {
        move(loc, vel);

    }
    abstract void move(Coordinate loc, Velocity vel);

    public Coordinate getLoc() {
        return loc;

    }

    public void setMaxVel(double val) {
        vel.setMaxSpeed(val);
    }

    public void setStandWidth(double val) {
        standLoc.setWidth(val);
    }

}
