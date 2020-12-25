package game;

import game.entity.bullet.BulletList;
import game.entity.enemy.EnemyList;
import game.entity.player.Player;
import inputs.*;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel implements Runnable {

    private final Background bkg;
    private final Player player;
    private final BulletList bulletList;
    private final EnemyList enemyList;

    private final Coordinate referencePoint;

    public void run() {
        while(true) {
            long timerVar = System.currentTimeMillis();
            update();
            while(timerVar + Constants.gameLoopTimeMillis >= System.currentTimeMillis());

        }

    }

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);

        bulletList = new BulletList(this);

        player = new Player(this);
        referencePoint = player.getLoc();

        enemyList = new EnemyList(this);

        Mouse.setReferencePoint(referencePoint);

        bkg = new Background(this);

    }

    public void update() {
        bkg.update(referencePoint);
        player.update(referencePoint, bulletList);
        bulletList.update(referencePoint);
        enemyList.update(referencePoint);

    }

}
