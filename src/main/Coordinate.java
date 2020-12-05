package main;

public class Coordinate {

    public double xLoc, yLoc;

    public Coordinate(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public void moveXY(double xDiff, double yDiff) {
        xLoc += xDiff;
        yLoc += yDiff;

    }

    public void setXY(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public double getX() {return xLoc;}
    public double getY() {return yLoc;}

    public int getIntX() {return (int)xLoc;}
    public int getIntY() {return (int)yLoc;}

}
