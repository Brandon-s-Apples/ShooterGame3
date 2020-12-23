package game;

import inputs.Constants;
import types.code.Coordinate;
import types.code.Velocity;

import javax.swing.*;

public class Bullet extends Entity {

    public Bullet(BulletList bulletList, Coordinate startLoc, Velocity velocity) {
        super(bulletList);
        setVel(velocity);
        setLoc(startLoc);

        // Temporary
        setIcon(new ImageIcon("D:/Pictures/apple.png"));
        setSize(626, 626);

    }

    public void move(Coordinate loc, Velocity vel) {
        loc.moveV(vel);
    }

    public void update() {
        super.update(Constants.origin);
    }

}
