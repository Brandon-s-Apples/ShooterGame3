package main;

import javax.swing.*;

public class BLabel extends JLabel {

    private int frameWidth, frameHeight;

    public BLabel(int frameWidth, int frameHeight) {
        super();
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;

    }

    public void setFrameDimension(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;

    }

    public void setBounds(int xLoc, int yLoc, int width, int height) {
        super.setBounds((frameWidth / 2) + xLoc - (width / 2), (frameHeight / 2) - yLoc - (height / 2), width, height);

    }

}
