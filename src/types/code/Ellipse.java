package types.code;

public class Ellipse {

    private Coordinate center;
    private double width, height;

    public Ellipse(Coordinate center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;

    }

    public void setCenter(Coordinate center) {
        this.center = center;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Coordinate getCenter() {
        return center;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
