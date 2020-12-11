package main;

import javax.swing.*;

public class Background extends BLabel {

    private ImageIcon bkgImageIcon = new ImageIcon("D:/Pictures/SchoologyDown.PNG");

    public Background() {
        super();
        setIcon(bkgImageIcon);
        setBounds(0, 0, bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());

    }

    public void updateGraphics(Coordinate playerLocation) {
        setBounds(-playerLocation.getIntX(), -playerLocation.getIntY(), bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());

    }

}
