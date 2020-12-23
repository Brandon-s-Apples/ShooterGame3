package game;

import inputs.Constants;
import methods.BMath;
import types.code.Coordinate;
import types.graphics.BFrame;

public class Main {

    public static void main(String[] args) {
        BFrame frame = new BFrame("Shooter Game 3", Constants.mainFrameWidth, Constants.mainFrameHeight);

        frame.setVisible(true);

        Coordinate c1 = new Coordinate(0, 0);
        Coordinate c2 = new Coordinate(-100, 75);
        System.out.println(BMath.angleTo(c1, c2));

        // Game game = new Game(frame);

    }

}