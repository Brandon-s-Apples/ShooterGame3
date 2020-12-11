package main;

import javax.swing.*;

public class Background extends CLabel {

    public Background(Icon image) {
        super(image);
        setDimension(image.getIconWidth(), image.getIconHeight());
    }

}
