package main;

import javax.swing.*;

public class BLabel extends JLabel {

    private static int frameWidth, frameHeight;

    public BLabel() {
        super();

    }

    public static void setFrameDimension(int width, int height) {
        BLabel.frameWidth = width;
        BLabel.frameHeight = height;

    }

    public void setBounds(int xLoc, int yLoc, int width, int height) {
        super.setBounds((frameWidth / 2) + xLoc - (width / 2), (frameHeight / 2) - yLoc - (height / 2), width, height);

    }

}
