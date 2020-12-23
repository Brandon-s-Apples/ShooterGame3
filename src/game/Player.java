package game;

import inputs.*;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public class Player extends Entity {

    public Player(JComponent game) {
        super(game);
        setLoc(new Coordinate(Constants.playerSpawn));
        setMaxVel(Constants.playerMaxSpeed);

    }

    public void update(BulletList bulletList) {
        super.update(getLoc());
        checkShoot(bulletList);
    }

    void move(Coordinate loc, Velocity vel) {
        boolean w = Keyboard.getKey('w') && !Keyboard.getKey('s'), a = Keyboard.getKey('a') && !Keyboard.getKey('d');
        boolean s = Keyboard.getKey('s') && !Keyboard.getKey('w'), d = Keyboard.getKey('d') && !Keyboard.getKey('a');
        if(w) vel.addAD(0, Constants.playerAcceleration);
        if(a) vel.addAD(270, Constants.playerAcceleration);
        if(s) vel.addAD(180, Constants.playerAcceleration);
        if(d) vel.addAD(90, Constants.playerAcceleration);
        if(!(w || s)) vel.multiplyY(Constants.playerDeceleration);
        if(!(a || d)) vel.multiplyX(Constants.playerDeceleration);

        loc.moveV(vel);

    }

    private void checkShoot(BulletList bulletList) {
        if(Mouse.getButton(Constants.leftClick)) {
            bulletList.add(new Coordinate(getLoc()), new Velocity(90, 10));

        }
    }

}
