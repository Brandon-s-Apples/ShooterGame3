package types.code;

public class Ellipse {

    private Coordinate center;
    private double width, height;

    public Ellipse(Coordinate center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;

    }

    public boolean contains(Coordinate loc) {
        double x = Math.pow(loc.getX() - center.getX(), 2) / Math.pow(width / 2, 2);
        double y = Math.pow(loc.getY() - center.getY(), 2) / Math.pow(height / 2, 2);
        return (x + y <= 1);

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

}
