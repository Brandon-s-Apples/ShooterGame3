package game;

import inputs.Constants;
import types.graphics.BFrame;

public class Main {

    public static void main(String[] args) {
        BFrame frame = new BFrame("Shooter Game 3", Constants.mainFrameWidth, Constants.mainFrameHeight);
        frame.setVisible(true);
        new Game(frame);

    }

}