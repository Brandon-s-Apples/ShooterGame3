package game;

import inputs.Constants;
import types.code.Coordinate;
import types.code.Ellipse;
import types.graphics.BLabel;

import javax.swing.*;

public class Player extends BLabel {

    private Coordinate loc;
    private Ellipse standLoc;

    public Player(JComponent game) {
        super(game);
        loc = new Coordinate(Constants.spawnX, Constants.spawnY);
        standLoc = new Ellipse(loc, Constants.playerStandWidth, Constants.playerStandHeight);

    }

    public Coordinate getLoc() {
        return loc;
    }

}
