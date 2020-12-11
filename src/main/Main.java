package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1900, 1100);
        frame.setResizable(false);
        frame.setLayout(null);

        CLabel cl = new CLabel(new ImageIcon("D:/Pictures/apple.png"));
        frame.add(cl);
        cl.setBoundDimension(1900, 1100);
        cl.setDimension(626, 626);
        cl.setBounds(0, 0);

        frame.setVisible(true);

    }

}
