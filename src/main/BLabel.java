package main;

import javax.swing.*;

public class BLabel extends JLabel {

    private static int frameWidth, frameHeight;

    public BLabel(ImageIcon image) {
        super(image);

    }

    public static void setFrameWidth(int frameWidth) {
        BLabel.frameWidth = frameWidth;

    }

    public static void setFrameHeight(int frameHeight) {
        BLabel.frameHeight = frameHeight;

    }

    public void setBounds(int xLoc, int yLoc, int width, int height) {
        super.setBounds((frameWidth / 2) + xLoc, (frameHeight / 2) - yLoc - height, width, height);

    }

}
