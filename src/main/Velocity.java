package main;

public class Velocity {

    private double xVel, yVel;

    public Velocity(double angle, double distance) {
        while(angle >= 360) angle -= 360;
        while(angle < 0) angle += 360;

        boolean flip = false;
        if(angle >= 180) {
            angle -= 180;
            flip = true;

        }

        final double sinAngle = Math.sin(Math.toRadians(angle));
        final double cosAngle = Math.cos(Math.toRadians(angle));

        double xVal = distance * sinAngle;
        double yVal = distance * cosAngle;

        if(!flip) {
            this.xVel = xVal;
            this.yVel = yVal;

        }
        else {
            this.xVel = -xVal;
            this.yVel = -yVal;

        }

    }

    public Velocity(Velocity velocity) {
        xVel = velocity.getXVel();
        yVel = velocity.getYVel();

    }

    public void addVelocity(Velocity velocity) {
        xVel += velocity.getXVel();
        yVel += velocity.getYVel();

    }

    public double getAngle() {
        if(getSpeed() == 0) return 0;
        double retVal = Math.toDegrees(Math.atan(xVel / yVel));
        if(yVel <= 0) {
            if(!(xVel > 0 && yVel == 0)) retVal += 180;

        } else if(xVel < 0 && yVel != 0) retVal += 360;
        return retVal;

    }

    public double getSpeed() {
        return Math.sqrt(Math.pow(xVel, 2) + Math.pow(yVel, 2));

    }

    public double getXVel() {
        return xVel;

    }

    public double getYVel() {
        return yVel;

    }

    public String toString() {
        return "Angle: " + getAngle() + "; Speed: " + getSpeed();

    }

}
