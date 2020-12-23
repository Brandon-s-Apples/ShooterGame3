package game;

import game.entity.bullet.BulletList;
import game.entity.enemy.Enemy;
import game.entity.enemy.EnemyList;
import game.entity.player.Player;
import inputs.*;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel {

    private Background bkg;
    private Player player;
    private BulletList bulletList;
    private EnemyList enemyList;

    private Coordinate referencePoint;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);

        player = new Player(this);
        referencePoint = player.getLoc();

        enemyList = new EnemyList(this);

        bulletList = new BulletList(this);

        Mouse.setReferencePoint(referencePoint);

        bkg = new Background(this);

        while(true) {
            long timerVar = System.currentTimeMillis();
            update();
            while(timerVar + Constants.gameLoopTimeMillis >= System.currentTimeMillis());

        }

    }

    public void update() {
        bkg.update(referencePoint);
        player.update(referencePoint, bulletList);
        bulletList.update(referencePoint);
        enemyList.update(referencePoint);

    }

}
