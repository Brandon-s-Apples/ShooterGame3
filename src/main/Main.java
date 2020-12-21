package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        BFrame frame = new BFrame("Shooter Game 3", Constants.frameWidth, Constants.frameHeight);

        BLabel label = new BLabel(frame, new ImageIcon("D:/Pictures/apple.png"));
        label.setSize(626, 626);
        label.setBounds(0, 0);
        frame.add(label);

        frame.setVisible(true);

    }

}