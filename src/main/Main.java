package main;

public class Main {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(0, 0);
        System.out.println(coordinate);

        coordinate.moveAD(135, 100);
        System.out.println(coordinate);

    }

}
