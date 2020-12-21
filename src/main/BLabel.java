package main;

import javax.swing.*;
import java.awt.*;

public class BLabel extends JLabel {

    private Dimension superDimen;

    public BLabel(JComponent superComp) {
        superDimen = superComp.getSize();

    }

    public BLabel(JComponent superComp, ImageIcon image) {
        super(image);
        superDimen = superComp.getSize();

    }

    public BLabel(JFrame superComp) {
        superDimen = superComp.getSize();

    }

    public BLabel(JFrame superComp, ImageIcon image) {
        super(image);
        superDimen = superComp.getSize();

    }

    public void setBounds(double x, double y) {
        setBounds((int) ((superDimen.getWidth() / 2) - ((double) getWidth() / 2) + x),
                (int) ((superDimen.getHeight() / 2) - ((double) getHeight() / 2) - y),
                getWidth(), getHeight());

    }

}
