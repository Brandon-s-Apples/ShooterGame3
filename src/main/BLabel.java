package main;

import javax.swing.*;

public class BLabel extends JLabel {

    private JComponent superComp;

    public BLabel(JComponent superComp) {
        this.superComp = superComp;

    }
    public BLabel(JComponent superComp, ImageIcon image) {
        super(image);
        this.superComp = superComp;

    }

    public void setBounds(double x, double y) {
        double wantedX = (superComp.getSize().getWidth() / 2) - ((double) getWidth() / 2) + x;
        double wantedY = (superComp.getSize().getHeight() / 2) + ((double) getHeight() / 2) - y;
        setBounds((int) wantedX, (int) wantedY, getWidth(), getHeight());

    }

}
