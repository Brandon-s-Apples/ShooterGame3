package main;

public class Coordinate {

    private double xLoc, yLoc;

    public Coordinate() {xLoc = 0; yLoc = 0;}

    public Coordinate(double x, double y) {xLoc = x; yLoc = y;}

    public void moveXY(double xDiff, double yDiff) {
        this.xLoc += xDiff;
        this.yLoc += yDiff;

    }

    public void moveAD(double angle, double distance) {
        this.xLoc += distance * Math.sin(Math.toRadians(angle));
        this.yLoc += distance * Math.cos(Math.toRadians(angle));

    }

    public String toString() {
        return "(" + xLoc + ", " + yLoc + ")";

    }

}
