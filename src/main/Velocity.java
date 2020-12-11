package main;

public class Velocity {

    private double xVel, yVel;
    private double maxSpeed;

    public Velocity(double angle, double speed) {
        xVel = speed * Math.sin(Math.toRadians(angle));
        yVel = speed * Math.cos(Math.toRadians(angle));
        maxSpeed = -1;

    }

    public Velocity(double angle, double speed, double maxSpeed) {
        xVel = speed * Math.sin(Math.toRadians(angle));
        yVel = speed * Math.cos(Math.toRadians(angle));
        this.maxSpeed = maxSpeed;

    }

    public void addAD(double angle, double speed) {
        xVel += speed * Math.sin(Math.toRadians(angle));
        yVel += speed * Math.cos(Math.toRadians(angle));
        checkSpeed();

    }

    public void addV(Velocity velocity) {
        xVel += velocity.getX();
        yVel += velocity.getY();
        checkSpeed();

    }

    public void slowX(double value) {
        xVel *= value;

    }

    public void slowY(double value) {
        yVel *= value;

    }

    public void slow(double value) {
        xVel *= value;
        yVel *= value;

    }

    public void checkSpeed() {
        if(getSpeed() > maxSpeed && maxSpeed != -1) {
            xVel *= maxSpeed / getSpeed();
            yVel *= maxSpeed / getSpeed();

        }

    }

    public void setMaxSpeed(double value) {
        maxSpeed = Math.abs(value);

    }

    public void removeMaxSpeed() {
        maxSpeed = -1;

    }

    public double getSpeed() {
        return Math.sqrt(Math.pow(xVel, 2) + Math.pow(yVel, 2));

    }

    public double getX() {
        return xVel;

    }

    public double getY() {
        return yVel;

    }

}
