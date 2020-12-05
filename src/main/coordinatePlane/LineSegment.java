package main.coordinatePlane;

public class LineSegment {

    private Coordinate startLoc, endLoc;

    public LineSegment(Coordinate startLoc, Coordinate endLoc) {
        this.startLoc = new Coordinate(startLoc);
        this.endLoc = new Coordinate(endLoc);

    }

    public double getSlope() {
        double xDiff = startLoc.getX() - endLoc.getX();
        double yDiff = startLoc.getY() - endLoc.getY();

        return yDiff / xDiff;

    }

    public double getYIntercept() {
        return -(getSlope() * startLoc.getX()) + startLoc.getY();

    }

    public double getLowXBound() {
        return Math.min(startLoc.getX(), endLoc.getX());

    }

    public double getHighXBound() {
        return Math.max(startLoc.getX(), endLoc.getX());

    }

    public double getLowYBound() {
        return Math.min(startLoc.getY(), endLoc.getY());

    }

    public double getHighYBound() {
        return Math.max(startLoc.getY(), endLoc.getY());

    }

    public boolean isVertical() {
        return startLoc.getX() == startLoc.getY();

    }

    public boolean contains(Coordinate coordinate) {
        if(isVertical() && (getLowYBound() <= coordinate.getY() && getHighYBound() >= coordinate.getY()))
            return true;
        if(getLowXBound() <= coordinate.getX() && getHighXBound() >= coordinate.getX())
            if(coordinate.getY() == (getSlope() * coordinate.getX()) + getYIntercept()) return true;

        return false;

    }

}
