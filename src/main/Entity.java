package main;

public class Entity extends CLabel {

    int health;
    double xLoc, yLoc;

    public Entity() {
        xLoc = -500;
        yLoc = 300;
        setDimension(626, 626);
        setBoundDimension(Main.windowWidth, Main.windowHeight);

    }

    public void updateGraphics(double playerX, double playerY) {
        setBounds((int)(xLoc - playerX), (int)(yLoc - playerY));

    }

}
