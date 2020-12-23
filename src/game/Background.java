package game;

import inputs.Constants;
import types.code.Coordinate;
import types.graphics.BLabel;

import javax.swing.*;

public class Background extends BLabel {

    public Background(JLabel game) {
        super(game);
        setIcon(Constants.bkgImg);
        setSize(Constants.bkgImg);
        setBounds(0, 0);

    }

    public void update(Coordinate playerLoc) {
        setBounds(-playerLoc.getX(), -playerLoc.getY());

    }

}
