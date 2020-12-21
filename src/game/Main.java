package game;

import inputs.Constants;
import types.graphics.BFrame;
import types.graphics.BLabel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        BFrame frame = new BFrame("Shooter Game 3", Constants.frameWidth, Constants.frameHeight);

        Game game = new Game(frame);

        frame.setVisible(true);

    }

}