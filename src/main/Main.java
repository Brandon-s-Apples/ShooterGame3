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

        Bullet slime = new Bullet(windowWidth, windowHeight, new Velocity(100, 5));
        frame.add(slime);

        Background bkg = new Background(windowWidth, windowHeight);
        frame.add(bkg);

        frame.setVisible(true);

        while(true) {
            player.update();
            slime.update();

            bkg.updateGraphics(player.getPlayerLoc());
            slime.updateGraphics(player.getPlayerLoc());
            player.updateGraphics();

            try {
                Thread.sleep(15);

            } catch (InterruptedException e) {}

        }

    }

}
