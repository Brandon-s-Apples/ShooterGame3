package methods;

import types.code.Coordinate;
import types.code.Ellipse;

public class BMath {

    public static double distanceFrom(Coordinate loc1, Coordinate loc2) {
        return Math.sqrt(Math.pow(loc1.getX() - loc2.getX(), 2) + Math.pow(loc1.getY() - loc2.getY(), 2));

    }

    public static boolean contains(Coordinate coordinate, Ellipse ellipse) {
        double x = Math.pow(coordinate.getX() - ellipse.getCenter().getX(), 2) / Math.pow(ellipse.getWidth() / 2, 2);
        double y = Math.pow(coordinate.getY() - ellipse.getCenter().getY(), 2) / Math.pow(ellipse.getHeight() / 2, 2);
        return (x + y <= 1);

    }

}
