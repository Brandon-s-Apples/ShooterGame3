package game;

import inputs.Constants;
import types.graphics.BLabel;

import javax.swing.*;

public class Game extends BLabel {

    public Game(JFrame frame) {
        super(frame);
        setSize(Constants.frameWidth, Constants.frameHeight);
        setBounds(0, 0);
        setIcon(new ImageIcon("D:/Pictures/among-us-map.png"));
        frame.add(this);

    }

}
