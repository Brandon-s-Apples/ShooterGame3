package main;

import javax.swing.*;

public class Background extends BLabel {

    ImageIcon bkgImageIcon = new ImageIcon("D:/Pictures/SchoologyDown.PNG");

    public Background() {
        super();
        setIcon(bkgImageIcon);

    }

    public void updateGraphics(Coordinate playerLocation) {
        setBounds(-playerLocation.getIntX(), -playerLocation.getIntY(), bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());

    }

}
