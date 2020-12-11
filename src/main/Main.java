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

        ImageIcon appleImageIcon = new ImageIcon("D:/Pictures/apple.png");
        JLabel player = new JLabel(appleImageIcon);
        Coordinate playerLoc = new Coordinate(0, 0);
        player.setBounds(950, 550, appleImageIcon.getIconWidth(), appleImageIcon.getIconHeight());
        frame.add(player);

        ImageIcon bkgImageIcon = new ImageIcon("D:/Pictures/SchoologyDown.PNG");
        JLabel bkg = new JLabel(bkgImageIcon);
        bkg.setBounds(0, 0, bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());
        frame.add(bkg);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    Thread.sleep(15);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                switch(e.getKeyChar()) {
                    case 'w':
                        playerLoc.moveXY(0, 10);
                        break;
                    case 'a':
                        playerLoc.moveXY(10, 0);
                        break;
                    case 's':
                        playerLoc.moveXY(0, -10);
                        break;
                    case 'd':
                        playerLoc.moveXY(-10, 0);
                        break;

                }

                bkg.setBounds(playerLoc.getIntX(), playerLoc.getIntY(), bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

        frame.setVisible(true);

    }

}
