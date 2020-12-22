package game;

import types.code.Coordinate;
import types.graphics.BLabel;

import javax.swing.*;

public class Background extends BLabel {

    public Background(JLabel game) {
        super(game);
        ImageIcon bkgImg = new ImageIcon("D:/Pictures/FinishedProblems.PNG");
        setIcon(bkgImg);
        setSize(bkgImg);
        setBounds(0, 0);

    }

    public void update(Coordinate playerLoc) {
        setBounds(-playerLoc.getX(), -playerLoc.getY());

    }

}
