package main;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shooter Game 3");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1900, 1100);

        BLabel.setFrameDimension(1900, 1100);
        Keyboard.init();
        frame.addKeyListener(Keyboard.getKeyListener());

        Player player = new Player();
        frame.add(player);

        Background bkg = new Background();
        frame.add(bkg);

        frame.setVisible(true);

        while(true) {
            player.update();

            bkg.updateGraphics(player.getPlayerLoc());
            player.updateGraphics();

            try {
                Thread.sleep(15);

            } catch (InterruptedException e) {}

        }

    }

}
