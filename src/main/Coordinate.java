package main;

public class Coordinate {

    private double xLoc, yLoc;

    public Coordinate(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public void moveAD(double angle, double distance) {
        xLoc += distance * Math.sin(Math.toRadians(angle));
        yLoc += distance * Math.cos(Math.toRadians(angle));

    }

    public void moveXY(double xDiff, double yDiff) {
        xLoc += xDiff;
        yLoc += yDiff;

    }

    public void moveV(Velocity velocity) {
        moveXY(velocity.getX(), velocity.getY());

    }

    public void setX(double value) {
        xLoc = value;

    }

    public void setY(double value) {
        yLoc = value;

    }

    public double getX() {
        return xLoc;

    }

    public double getY() {
        return yLoc;

    }

    public int getIntX() {
        return (int)xLoc;

    }

    public int getIntY() {
        return (int)yLoc;

    }

}
