package main;

public class LineSegment {

    private Coordinate startLoc, endLoc;

    public LineSegment(Coordinate startLoc, Coordinate endLoc) {
        this.startLoc = new Coordinate(startLoc);
        this.endLoc = new Coordinate(endLoc);

    }

    public boolean contains(Coordinate coordinate) {
        if(coordinate.distanceFrom(startLoc) == coordinate.distanceFrom(endLoc)) return true;
        else return false;

    }

}
