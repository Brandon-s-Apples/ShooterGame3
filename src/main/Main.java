package main;

import javax.swing.*;

public class Main {

    public static final int windowWidth = 1900, windowHeight = 1100;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shooter Game 3");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1900, 1100);

        Keyboard.init();
        frame.addKeyListener(Keyboard.getKeyListener());

        Player player = new Player(windowWidth, windowHeight);
        frame.add(player);

        Slime entity = new Slime(windowWidth, windowHeight);
        frame.add(entity);

        Background bkg = new Background(windowWidth, windowHeight);
        frame.add(bkg);

        frame.setVisible(true);

        while(true) {
            player.update();
            entity.updateLoc();

            bkg.updateGraphics(player.getPlayerLoc());
            entity.updateGraphics(player.getPlayerLoc());
            player.updateGraphics();

            try {
                Thread.sleep(15);

            } catch (InterruptedException e) {}

        }

    }

}
