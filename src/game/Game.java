package game;

import inputs.Constants;
import inputs.Mouse;
import types.code.Coordinate;
import types.code.Velocity;
import types.graphics.BLabel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends BLabel {

    private long timerVar;

    private Background bkg;
    private Player player;

    // Temporary
    private Bullet bullet;
    private BulletList bulletList;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);
        player = new Player(this);
        bulletList = new BulletList(this);

        // Temporary
        addBullet(new Coordinate(player.getLoc()), new Velocity(2, 0));
        addBullet(new Coordinate(player.getLoc()), new Velocity(-2, 0));

        Mouse.setReferencePoint(player.getLoc());

        bkg = new Background(this);

        while(true) {
            timerVar = System.currentTimeMillis();
            update();
            while(timerVar + Constants.gameLoopTimeMillis >= System.currentTimeMillis());

        }

    }

    public void update() {
        bkg.update(player.getLoc());
        player.update();
        bulletList.update(player.getLoc());

    }

    public void addBullet(Coordinate startLoc, Velocity velocity) {
        bulletList.add(startLoc, velocity);
    }

}
