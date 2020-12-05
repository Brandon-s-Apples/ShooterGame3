package main;

public class Coordinate {

    public double xLoc, yLoc;

    public Coordinate(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public Coordinate(Coordinate coordinate) {
        this.xLoc = coordinate.getX();
        this.yLoc = coordinate.getY();

    }

    public void moveXY(double xDiff, double yDiff) {
        xLoc += xDiff;
        yLoc += yDiff;

    }

    public void moveAD(double angle, double distance) {
        while(angle >= 360) angle -= 360;
        while(angle < 0) angle += 360;

        boolean flip = false;
        if(angle >= 180) {
            angle -= 180;
            flip = true;

        }
        if(angle > 90) flip = !flip;

        final double tanAngle = Math.tan(Math.toRadians(angle));

        double xDiff = (distance * tanAngle) / Math.sqrt(Math.pow(tanAngle, 2) + 1);
        double yDiff = Math.sqrt(Math.pow(distance, 2) - Math.pow(xDiff, 2));

        if(!flip) moveXY(xDiff, yDiff);
        else moveXY(-xDiff, -yDiff);

    }

    public void setXY(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public double getX() {return xLoc;}
    public double getY() {return yLoc;}

    public int getIntX() {return (int)xLoc;}
    public int getIntY() {return (int)yLoc;}

    public String toString() {
        return "(" + xLoc + ", " + yLoc + ")";

    }

}
