package game;

import inputs.Constants;
import methods.BMath;
import types.code.Coordinate;
import types.graphics.BFrame;

public class Main {

    public static void main(String[] args) {
        BFrame frame = new BFrame("Shooter Game 3", Constants.mainFrameWidth, Constants.mainFrameHeight);

        frame.setVisible(true);

        Game game = new Game(frame);

    }

}