package main;

import javax.swing.*;

public class Background extends CLabel {

    public Background(Icon image) {
        super(image);
        setDimension(image.getIconWidth(), image.getIconHeight());
        setBoundDimension(Main.windowWidth, Main.windowHeight);

    }

    public void updateGraphics(double playerX, double playerY) {
        setBounds((int)-playerX, (int)-playerY);
    }

}
