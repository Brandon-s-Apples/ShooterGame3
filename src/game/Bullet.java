package game;

import types.code.Coordinate;
import types.code.Velocity;

import javax.swing.*;

public class Bullet extends Entity {

    public Bullet(JComponent game, Coordinate startLoc, Velocity velocity) {
        super(game);
        setVel(velocity);
        setLoc(startLoc);

    }

    public void move(Coordinate loc, Velocity vel) {
        loc.moveV(vel);

    }

}
