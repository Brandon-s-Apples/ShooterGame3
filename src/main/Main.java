package main;

public class Main {

    public static void main(String[] args) {
        LineSegment lineSegment = new LineSegment(new Coordinate(0, 0), new Coordinate(100, 100));
        System.out.println(lineSegment.contains(new Coordinate(3.1415926, 3.1415926)));

    }

}
