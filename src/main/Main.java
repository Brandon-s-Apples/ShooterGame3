package main;

import main.coordinatePlane.Coordinate;
import main.coordinatePlane.LineSegment;

public class Main {

    public static void main(String[] args) {
        LineSegment lineSegment = new LineSegment(new Coordinate(0, 0), new Coordinate(0, 100));
        System.out.println(lineSegment.contains(new Coordinate(0, 5.119273928001)));

    }

}
