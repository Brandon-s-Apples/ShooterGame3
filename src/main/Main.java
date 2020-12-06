package main;

import main.coordinatePlane.*;
import main.entity.Entity;
import main.entity.Player;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int windowWidth = 1900, windowHeight = 1100;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing");
        frame.setSize(windowWidth, windowHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        Player player = new Player(new Coordinate(0, 0));
        player.setBounds();
        frame.add(player);

    }

}
