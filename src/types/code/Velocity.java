package types.code;

public class Velocity {

    private double xVel, yVel, maxSpeed;

    public Velocity() {
        xVel = 0;
        yVel = 0;
        maxSpeed = -1;
    }

    public Velocity(double maxSpeed) {
        xVel = 0;
        yVel = 0;
        this.maxSpeed = Math.abs(maxSpeed);
        checkSpeed();
    }

    public Velocity(double angle, double distance) {
        angle %= 360;
        if(angle == 0) yVel += distance;
        else if(angle == 90 || angle == -270) xVel += distance;
        else if(angle == 180 || angle == -180) yVel -= distance;
        else if(angle == 270 || angle == -90) xVel -= distance;
        else {
            xVel = distance * Math.sin(Math.toRadians(angle));
            yVel = distance * Math.cos(Math.toRadians(angle));

        }
        maxSpeed = -1;
    }

    public Velocity(double angle, double distance, double maxSpeed) {
        angle %= 360;
        if(angle == 0) yVel += distance;
        else if(angle == 90 || angle == -270) xVel += distance;
        else if(angle == 180 || angle == -180) yVel -= distance;
        else if(angle == 270 || angle == -90) xVel -= distance;
        else {
            xVel = distance * Math.sin(Math.toRadians(angle));
            yVel = distance * Math.cos(Math.toRadians(angle));

        }
        this.maxSpeed = Math.abs(maxSpeed);
        checkSpeed();
    }

    public void removeMaxSpeed() {
        maxSpeed = -1;
    }

    public void addXY(double xDiff, double yDiff) {
        xVel += xDiff;
        yVel += yDiff;
        checkSpeed();
    }

    public void addAD(double angle, double distance) {
        angle %= 360;
        if(angle == 0) yVel += distance;
        else if(angle == 90 || angle == -270) xVel += distance;
        else if(angle == 180 || angle == -180) yVel -= distance;
        else if(angle == 270 || angle == -90) xVel -= distance;
        else {
            xVel += distance * Math.sin(Math.toRadians(angle));
            yVel += distance * Math.cos(Math.toRadians(angle));

        }
        checkSpeed();

    }

    public void multiply(double val) {
        xVel *= val;
        yVel *= val;

    }

    public void multiplyX(double val) {
        xVel *= val;
    }

    public void multiplyY(double val) {
        yVel *= val;
    }

    public void checkSpeed() {
        if(getSpeed() > maxSpeed && maxSpeed != -1) {
            xVel *= maxSpeed / getSpeed();
            yVel *= maxSpeed / getSpeed();
        }
    }

    public double getSpeed() {
        return Math.sqrt(Math.pow(xVel, 2) + Math.pow(yVel, 2));
    }

    public double getX() {
        return xVel;
    }

    public double getY() {
        return yVel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = Math.abs(maxSpeed);
    }

}
