package game;

import types.graphics.BLabel;

import javax.swing.*;

public class Background extends BLabel {

    public Background(JLabel game) {
        super(game);
        ImageIcon bkgImg = new ImageIcon("D:/Pictures/FinishedProblems.PNG");
        setIcon(bkgImg);
        setSize(bkgImg.getIconWidth(), bkgImg.getIconHeight());
        setBounds(0, 0);

    }

}
