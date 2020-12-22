package game;

import types.code.Coordinate;
import types.code.Velocity;
import types.graphics.BLabel;

import javax.swing.*;

public abstract class Entity extends BLabel {

    private Coordinate loc;
    private Velocity vel;

    public Entity(JComponent game) {
        super(game);
        loc = new Coordinate();
        vel = new Velocity();

    }

    public void update() {
        move(loc, vel);

    }
    abstract void move(Coordinate loc, Velocity vel);

    public Coordinate getLoc() {
        return loc;

    }

}
