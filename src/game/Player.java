package game;

import inputs.Constants;
import inputs.Keyboard;
import types.code.Coordinate;
import types.code.Ellipse;
import types.code.Velocity;
import types.graphics.BLabel;

import javax.swing.*;

public class Player extends Entity {

    private Ellipse standLoc;

    public Player(JComponent game) {
        super(game);
        setMaxVel(Constants.playerMaxSpeed);
//        standLoc = new Ellipse(loc, Constants.playerStandWidth, Constants.playerStandHeight);

    }

//    public Coordinate getLoc() {
//        return loc;
//    }

    void move(Coordinate loc, Velocity vel) {
        boolean w = Keyboard.getKey('w') && !Keyboard.getKey('s'), a = Keyboard.getKey('a') && !Keyboard.getKey('d');
        boolean s = Keyboard.getKey('s') && !Keyboard.getKey('w'), d = Keyboard.getKey('d') && !Keyboard.getKey('a');
        if(w) vel.addAD(0, Constants.playerAcceleration);
        if(a) vel.addAD(270, Constants.playerAcceleration);
        if(s) vel.addAD(180, Constants.playerAcceleration);
        if(d) vel.addAD(90, Constants.playerAcceleration);
        if(!(w || s)) vel.multiplyY(Constants.playerDeceleration);
        if(!(a || d)) vel.multiplyX(Constants.playerDeceleration);

        loc.moveV(vel);

    }

}
