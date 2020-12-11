package main;

import javax.swing.*;

public class BLabel extends JLabel {

    private static int frameWidth, frameHeight;

    public BLabel(ImageIcon image) {
        super(image);

    }

    public static void setFrameDimension(int width, int height) {
        BLabel.frameWidth = width;
        BLabel.frameHeight = height;

    }

    public void setBounds(int xLoc, int yLoc, int width, int height) {
        super.setBounds((frameWidth / 2) + xLoc, (frameHeight / 2) - yLoc - height, width, height);

    }

}
