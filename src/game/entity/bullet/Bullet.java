package game.entity.bullet;

import game.entity.Entity;
import game.entity.enemy.EnemyList;
import game.entity.player.Player;
import inputs.Constants;
import types.code.*;

import javax.swing.*;

public class Bullet extends Entity {

    private static EnemyList enemyListRef;
    private static Player playerListRef;

    public Bullet(BulletList bulletList, Coordinate startLoc, Velocity velocity) {
        super(bulletList);
        setVel(velocity);
        setLoc(startLoc);

        // Temporary
        setIcon(new ImageIcon("D:/Pictures/apple.png"));
        setSize(626, 626);

    }

    protected void move(Coordinate loc, Velocity vel) {
        Coordinate startLoc = new Coordinate(getLoc());
        loc.moveV(vel);
        Coordinate endLoc = new Coordinate(getLoc());
        LineSegment path = new LineSegment(startLoc, endLoc);
    }

    public void update() {
        super.update(Constants.origin);
    }

    public static void setEnemyListRef(EnemyList enemyListRef) {
        Bullet.enemyListRef = enemyListRef;
    }

    public static void setPlayerListRef(Player playerListRef) {
        Bullet.playerListRef = playerListRef;
    }

}
