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

        Player player = new Player();
        frame.add(player);

        ImageIcon bkgImageIcon = new ImageIcon("D:/Pictures/SchoologyDown.PNG");
        BLabel bkg = new BLabel(bkgImageIcon);
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
                        player.getPlayerLoc().moveAD(0, 10);
                        break;
                    case 'a':
                        player.getPlayerLoc().moveAD(270, 10);
                        break;
                    case 's':
                        player.getPlayerLoc().moveAD(180, 10);
                        break;
                    case 'd':
                        player.getPlayerLoc().moveAD(90, 10);
                        break;

                }

                bkg.setBounds(player.getPlayerLoc().getIntX(), player.getPlayerLoc().getIntY(), bkgImageIcon.getIconWidth(), bkgImageIcon.getIconHeight());

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

        frame.setVisible(true);

    }

}
