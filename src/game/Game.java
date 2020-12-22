package game;

import inputs.Constants;
import types.code.Coordinate;
import types.code.Velocity;
import types.graphics.BLabel;

import javax.swing.*;
import java.awt.*;

public class Game extends BLabel {

    private long timerVar;

    private Background bkg;
    private Player player;

    // Temporary
    private Bullet bullet;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);
        player = new Player(this);

        bullet = new Bullet(this, new Coordinate(player.getLoc()), new Velocity(2, 0));
        bullet.setSize(626, 626);
        bullet.setIcon(new ImageIcon("D:/Pictures/apple.png"));

        bkg = new Background(this);

        while(true) {
            timerVar = System.currentTimeMillis();
            update();
            while(timerVar + Constants.gameLoopTimeMillis >= System.currentTimeMillis());

        }

    }

    public void update() {
        bkg.update(player.getLoc());
        player.update(player.getLoc());

        bullet.update(player.getLoc());

    }

}
