package types.code;

public class Coordinate {

    private double xLoc, yLoc;

    public Coordinate() {
        xLoc = 0;
        yLoc = 0;
    }

    public Coordinate(double x, double y) {
        xLoc = x;
        yLoc = y;
    }

    public Coordinate(Coordinate coordinate) {
        xLoc = coordinate.getX();
        yLoc = coordinate.getY();
    }

    public void setXY(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void moveXY(double xDiff, double yDiff) {
        this.xLoc += xDiff;
        this.yLoc += yDiff;

    }

    public void moveAD(double angle, double distance) {
        angle %= 360;
        if(angle == 0) yLoc += distance;
        else if(angle == 90 || angle == -270) xLoc += distance;
        else if(angle == 180 || angle == -180) yLoc -= distance;
        else if(angle == 270 || angle == -90) xLoc -= distance;
        else {
            xLoc += distance * Math.sin(Math.toRadians(angle));
            yLoc += distance * Math.cos(Math.toRadians(angle));

        }

    }

    public void moveV(Velocity velocity) {
        xLoc += velocity.getX();
        yLoc += velocity.getY();

    }

    public double getX() {
        return xLoc;
    }

    public double getY() {
        return yLoc;
    }

    public String toString() {
        return "(" + xLoc + ", " + yLoc + ")";

    }

}
