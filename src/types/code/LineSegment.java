package types.code;

public class LineSegment {

    private Coordinate startLoc, endLoc;

    public LineSegment(Coordinate endPoint1, Coordinate endPoint2) {
        if(endPoint1.getX() < endPoint2.getX()) {
            startLoc = new Coordinate(endPoint1);
            endLoc = new Coordinate(endPoint2);
        } else if(endPoint1.getX() == endPoint2.getX()) {
            if(endPoint1.getY() < endPoint2.getY()) {
                startLoc = new Coordinate(endPoint2);
                endLoc = new Coordinate(endPoint1);
            } else {
                startLoc = new Coordinate(endPoint1);
                endLoc = new Coordinate(endPoint2);
            }
        } else {
            startLoc = new Coordinate(endPoint2);
            endLoc = new Coordinate(endPoint1);
        }
    }

    public Coordinate getStartLoc() {
        return startLoc;
    }

    public Coordinate getEndLoc() {
        return endLoc;
    }

    public boolean isVertical() {
        return startLoc.getY() == endLoc.getY();
    }

    public double getSlope() {
        return (startLoc.getX() - endLoc.getX()) / (startLoc.getY() - endLoc.getY());
    }

    public double getYInt() {
        return startLoc.getY() - (startLoc.getX() * getSlope());
    }

}