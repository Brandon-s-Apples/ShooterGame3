package game.entity.player;

import game.entity.bullet.BulletList;
import game.entity.Entity;
import inputs.*;
import methods.BMath;
import types.code.*;

import javax.swing.*;

public class Player extends Entity {

    public Player(JComponent game) {
        super(game);
        setLoc(new Coordinate(Constants.playerSpawnLoc));
        setMaxVel(Constants.playerMaxSpeed);
        setIcon(new ImageIcon("src/files/apple.png"));
        setSize(626, 626);
    }

    public void update(Coordinate referencePoint, BulletList bulletList) {
        super.update(referencePoint);
        checkShoot(bulletList);
    }

    protected void move(Coordinate loc, Velocity vel) {
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
            bulletList.add(new Coordinate(getLoc()), new Velocity(BMath.angleTo(getLoc(), Mouse.getLoc()), 10));
        }
    }

}
