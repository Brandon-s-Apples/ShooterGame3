package methods;

import types.code.Coordinate;

import java.util.ArrayList;

public class BArray {

    private BArray() {}

    public static Coordinate[] toCoordinateArray(ArrayList<Coordinate> coordinateList) {
        Coordinate[] retVal = new Coordinate[coordinateList.size()];
        for(int i = 0; i < coordinateList.size(); i++) retVal[i] = coordinateList.get(i);
        return retVal;

    }

}
