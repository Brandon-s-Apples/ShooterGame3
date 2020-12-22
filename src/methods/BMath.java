package methods;

import types.code.Coordinate;

public class BMath {

    public static double distanceFrom(Coordinate loc1, Coordinate loc2) {
        return Math.sqrt(Math.pow(loc1.getX() - loc2.getX(), 2) + Math.pow(loc1.getY() - loc2.getY(), 2));

    }

}
