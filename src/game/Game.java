package game;

import inputs.Constants;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel {

    long timerVar;

    Background bkg;
    Player player;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);
        bkg = new Background(this);
        player = new Player(this);

        while(true) {
            timerVar = System.currentTimeMillis();
            update();
            while(timerVar + Constants.gameLoopTimeMillis >= System.currentTimeMillis());

        }

    }

    public void update() {
        bkg.update(player.getLoc());
        player.update();

    }

}
