package types.graphics;

import types.code.Coordinate;

import javax.swing.*;
import java.awt.*;

public class BLabel extends JLabel {

    private Dimension superDimen;

    public BLabel(JComponent superComp) {
        superDimen = superComp.getSize();
        superComp.add(this);

    }

    public BLabel(JComponent superComp, ImageIcon image) {
        super(image);
        superDimen = superComp.getSize();
        setSize(image);
        superComp.add(this);

    }

    public BLabel(JFrame superComp) {
        superDimen = superComp.getSize();
        superComp.add(this);

    }

    public BLabel(JFrame superComp, ImageIcon image) {
        super(image);
        superDimen = superComp.getSize();
        setSize(image);
        superComp.add(this);

    }

    public void setBounds(double x, double y) {
        setBounds((int) ((superDimen.getWidth() / 2) - ((double) getWidth() / 2) + x),
                (int) ((superDimen.getHeight() / 2) - ((double) getHeight() / 2) - y),
                getWidth(), getHeight());
    }

    public void setBounds(Coordinate loc) {
        setBounds((int) ((superDimen.getWidth() / 2) - ((double) getWidth() / 2) + loc.getX()),
                (int) ((superDimen.getHeight() / 2) - ((double) getHeight() / 2) - loc.getY()),
                getWidth(), getHeight());
    }

    public void setSize(ImageIcon image) {
        setSize(image.getIconWidth(), image.getIconHeight());

    }

}
