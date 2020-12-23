package game;

import inputs.*;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel {

    private long timerVar;

    private Background bkg;
    private Player player;
    private BulletList bulletList;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);
        player = new Player(this);
        bulletList = new BulletList(this);

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
        player.update(bulletList);
        bulletList.update(player.getLoc());

    }

}
