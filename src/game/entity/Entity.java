package game.entity;

import inputs.Constants;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;

public abstract class Entity extends BLabel {

    public enum State {
        IDLE, CHARGING, ATTACKING, DYING, DEAD

    }

    private Coordinate loc;
    private Velocity vel;
    private Ellipse standLoc;
    private State state;

    private long timer;

    private double health;

    public Entity(JComponent game) {
        super(game);
        loc = new Coordinate();
        vel = new Velocity();
        standLoc = new Ellipse(loc, Constants.entityDefaultStandWidth, Constants.entityDefaultStandHeight);
        state = State.IDLE;
        health = 20;

    }

    public void update(Coordinate referencePoint) {
        move(loc, vel);
        if(health <= 0 && (state != State.DYING && state != State.DEAD)) {
            state = State.DYING;
            timer = System.currentTimeMillis();
        } else if(state == State.DYING && timer + Constants.dyingTime <= System.currentTimeMillis()) state = State.DEAD;
        setBounds(referencePoint);
    }
    protected abstract void move(Coordinate loc, Velocity vel);

    public Coordinate getLoc() {
        return loc;
    }

    public void setMaxVel(double val) {
        vel.setMaxSpeed(val);
    }

    public void setVel(Velocity vel) {
        this.vel = vel;
    }

    public void setLoc(Coordinate loc) {
        this.loc = loc;
    }

    public void setStandWidth(double val) {
        standLoc.setWidth(val);
    }

    public void setBounds(Coordinate referencePoint) {
        setBounds(loc.getX() - referencePoint.getX(), loc.getY() - referencePoint.getY());
    }

    public State getState() {
        return state;
    }

}
