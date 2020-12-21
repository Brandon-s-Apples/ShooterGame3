package game;

import inputs.Constants;
import types.code.Coordinate;
import types.graphics.BLabel;

import javax.swing.*;

public class Player extends BLabel {

    private Coordinate loc;

    public Player(JComponent game) {
        super(game);
        loc = new Coordinate(Constants.spawnX, Constants.spawnY);

    }

    public Coordinate getLoc() {
        return loc;
    }

}
