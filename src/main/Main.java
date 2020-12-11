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
        cl.setWidth(626);
        cl.setHeight(626);
        cl.setBoundWidth(1900);
        cl.setBoundHeight(1100);
        cl.setBounds(0, 0);

        frame.setVisible(true);

    }

}
