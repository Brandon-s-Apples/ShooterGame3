package main.coordinatePlane;

public class Elipse {

    private Coordinate center;
    private double height, width;

    public Elipse(Coordinate center, double height, double width) {
        this.center = new Coordinate(center);
        this.height = height;
        this.width = width;

    }

    public boolean contains(Coordinate coordinate) {
        double x = Math.pow((coordinate.getX() - center.getX()), 2) / Math.pow(width, 2);
        double y = Math.pow((coordinate.getY() - center.getY()), 2) / Math.pow(height, 2);
        if (x + y <= 1) return true;
        return false;

    }

}
