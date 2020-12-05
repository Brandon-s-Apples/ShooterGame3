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
        if(angle > 90) flip = !flip;

        final double tanAngle = Math.tan(Math.toRadians(angle));

        double xVal = (distance * tanAngle) / Math.sqrt(Math.pow(tanAngle, 2) + 1);
        double yVal = Math.sqrt(Math.pow(distance, 2) - Math.pow(xVal, 2));

        if(!flip) {
            this.xVel = xVal;
            this.yVel = yVal;

        }
        else {
            this.xVel = -xVal;
            this.yVel = -yVal;

        }

    }

    public double getAngle() {
        double retVal = Math.toDegrees(Math.atan(xVel / yVel));
        if(yVel <= 0) {
            if(!(xVel > 0 && yVel == 0)) retVal += 180;

        } else if(xVel < 0 && yVel != 0) retVal += 360;
        return retVal;

    }

    public double getSpeed() {
        return Math.sqrt(Math.pow(xVel, 2) + Math.pow(yVel, 2));

    }

    public String toString() {
        return "Angle: " + getAngle() + "; Speed: " + getSpeed();

    }

}
