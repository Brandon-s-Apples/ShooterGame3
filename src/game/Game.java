package game;

import inputs.Constants;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel {

    Background bkg;

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.frameWidth, Constants.frameHeight);
        setBounds(0, 0);
        bkg = new Background(this);

        while(true) {
            update();

        }

    }

    public void update() {
        bkg.update(player.getLoc());

    }

}
