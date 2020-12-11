package main;

import javax.swing.*;

public class Main {

    public static final int windowWidth = 1900, windowHeight = 1100;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(windowWidth, windowHeight);
        frame.setResizable(false);
        frame.setLayout(null);

        CLabel cl = new CLabel(new ImageIcon("D:/Pictures/apple.png"));
        frame.add(cl);
        cl.setBoundDimension(windowWidth, windowHeight);
        cl.setDimension(626, 626);
        cl.setBounds(0, 0);

        Background bkg = new Background(new ImageIcon("D:/Pictures/SchoologyDown.PNG"));
        bkg.updateGraphics(500, 500);
        frame.add(bkg);

        frame.setVisible(true);

    }

}
