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
        ArrayList<Coordinate> retVal = new ArrayList<>();
        final double cX = ellipse.getCenter().getX(), cY = ellipse.getCenter().getY();
        final double width = ellipse.getWidth() / 2, height = ellipse.getHeight() / 2;

        if(lineSegment.isVertical()) {
            double findX = lineSegment.getStartLoc().getX();
            double startX = cX - (width / 2);
            double endX = cX + (width / 2);
            if(findX == startX || findX == endX) {
                retVal.add(new Coordinate(findX, cY));
            } else if(findX > startX && findX < endX) {
                final double sqrt = height * Math.sqrt(1 - (Math.pow(findX - cX, 2) / Math.pow(width, 2)));
                retVal.add(new Coordinate(findX, sqrt + cY));
                retVal.add(new Coordinate(findX, -sqrt + cY));

            }

        } else {
            final double slope = lineSegment.getSlope(), yInt = lineSegment.getYInt();

            final double a = Math.pow(height, 2) + Math.pow(slope * width, 2);
            final double b = (-2 * cX * Math.pow(height, 2)) + (2 * slope * yInt * Math.pow(width, 2)) - (2 * cY * slope * Math.pow(width, 2));
            final double c = (Math.pow(cX * height, 2)) + Math.pow(yInt * width, 2) - (2 * cY * yInt * Math.pow(width, 2)) + Math.pow(cY * width, 2) - Math.pow(width * height, 2);
            final double discriminant = Math.pow(b, 2) - (4 * a * c);

            if(discriminant >= 0) {
                double xVal = (-b + Math.sqrt(discriminant)) / (2 * a);
                retVal.add(new Coordinate(xVal, (slope * xVal) + yInt));
                if(discriminant > 0) {
                    xVal = (-b - Math.sqrt(discriminant)) / (2 * a);
                    retVal.add(new Coordinate(xVal, (slope * xVal) + yInt));
                }
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
