package main;

import javax.swing.*;

public class CLabel extends JLabel {

    private int width, height;
    private int boundWidth, boundHeight;

    public CLabel() {
        super();
    }

    public CLabel(Icon image) {
        super(image);
    }

    public CLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public CLabel(String text) {
        super(text);
    }

    public CLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public CLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public void setBounds(int x, int y) {
        setBounds((boundWidth / 2) + x - (width / 2), (boundHeight / 2) - y - (height / 2), width, height);

    }

    public void setDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setBoundDimension(int boundWidth, int boundHeight) {
        this.boundWidth = boundWidth;
        this.boundHeight = boundHeight;
    }

}
