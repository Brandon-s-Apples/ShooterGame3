package methods;

import types.code.Coordinate;
import types.code.Ellipse;
import types.code.LineSegment;

import java.util.ArrayList;

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
    
    public static Coordinate[] intersects(LineSegment lineSegment, Ellipse ellipse) {
        double cX = ellipse.getCenter().getX(), cY = ellipse.getCenter().getY();
        double slope = lineSegment.getSlope(), yInt = lineSegment.getYInt();
        double width = ellipse.getWidth() / 2, height = ellipse.getHeight() / 2;

        double a = Math.pow(height, 2) + Math.pow(slope * width, 2);
        double b = (-2 * cX * Math.pow(height, 2)) + (2 * slope * yInt * Math.pow(width, 2)) - (2 * cY * slope * Math.pow(width, 2));
        double c = (Math.pow(cX * height, 2)) + Math.pow(yInt * width, 2) - (2 * cY * yInt * Math.pow(width, 2)) + Math.pow(cY * width, 2) - Math.pow(width * height, 2);
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        ArrayList<Coordinate> retVal = new ArrayList<>();
        if(discriminant >= 0) {
            double xVal = (Math.pow(b, 2) + Math.sqrt(discriminant)) / (4 * a);
            retVal.add(new Coordinate(xVal, (slope * xVal) + yInt));
            if(discriminant > 0) {
                xVal = (Math.pow(b, 2) - Math.sqrt(discriminant)) / (4 * a);
                retVal.add(new Coordinate(xVal, (slope * xVal) + yInt));
            }
        }
        for(int i = retVal.size() - 1; i >= 0; i--) if(!contains(retVal.get(i), lineSegment)) retVal.remove(i);
        return BArray.toCoordinateArray(retVal);

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
