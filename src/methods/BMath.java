package methods;

import types.code.Coordinate;
import types.code.Ellipse;
import types.code.LineSegment;

public class BMath {

    public static double distanceFrom(Coordinate loc1, Coordinate loc2) {
        return Math.sqrt(Math.pow(loc1.getX() - loc2.getX(), 2) + Math.pow(loc1.getY() - loc2.getY(), 2));

    }

    public static boolean contains(Coordinate coordinate, Ellipse ellipse) {
        double x = Math.pow(coordinate.getX() - ellipse.getCenter().getX(), 2) / Math.pow(ellipse.getWidth() / 2, 2);
        double y = Math.pow(coordinate.getY() - ellipse.getCenter().getY(), 2) / Math.pow(ellipse.getHeight() / 2, 2);
        return (x + y <= 1);

    }

    public static boolean contains(Coordinate coordinate, LineSegment lineSegment) {
        if(lineSegment.isVertical()) {
            if(coordinate.getX() == lineSegment.getStartLoc().getX()) {
                return lineSegment.getStartLoc().getY() >= coordinate.getY() && lineSegment.getEndLoc().getY() <= coordinate.getY();
            }
            return false;
        }
        if(coordinate.getX() < lineSegment.getStartLoc().getX() || coordinate.getX() > lineSegment.getEndLoc().getX()) return false;
        return coordinate.getY() == lineSegment.getSlope() * coordinate.getX() + lineSegment.getYInt();
    }

    public static double angleTo(Coordinate loc1, Coordinate loc2) {
        if(loc1.getX() == loc2.getX()) {
            if(loc1.getY() < loc2.getY()) return 0;
            else return 180;

        }
        if(loc1.getY() == loc2.getY()) {
            if(loc1.getX() < loc2.getX()) return 90;
            else return 270;

        }
        double retVal = Math.toDegrees(Math.asin((loc2.getX() - loc1.getX()) / distanceFrom(loc1, loc2)));
        if(loc2.getY() < loc1.getY()) retVal = 180 - retVal;
        if(retVal < 0) retVal += 360;
        return retVal;

    }

}
