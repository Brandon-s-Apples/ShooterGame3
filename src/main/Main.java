package main;

import main.coordinatePlane.*;

public class Main {

    public static void main(String[] args) {
        Elipse elipse = new Elipse(new Coordinate(0, 0), 5, 10);
        System.out.println(elipse.contains(new Coordinate(0, 0)));

    }

}
