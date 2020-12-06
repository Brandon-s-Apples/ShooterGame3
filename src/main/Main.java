package main;

import main.coordinatePlane.*;
import main.entity.Entity;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int windowWidth = 1900, windowHeight = 1100;

    public static void main(String[] args) {
        /*JFrame frame = new JFrame("Testing");
        frame.setSize(windowWidth, windowHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/

        Velocity velocity = new Velocity(45, 100);
        velocity.setMaxSpeed(150);
        System.out.println(velocity);
        velocity.addVelocity(new Velocity(225, 1000));
        System.out.println(velocity);

    }

}
