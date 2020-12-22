package game;

import types.code.Coordinate;
import types.graphics.BLabel;

import javax.swing.*;

public abstract class Entity extends BLabel {

    public Entity(JComponent game) {
        super(game);

    }

    abstract void update();
    abstract void move();

}
