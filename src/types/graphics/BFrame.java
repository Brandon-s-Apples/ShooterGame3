package types.graphics;

import inputs.Keyboard;
import inputs.Mouse;

import javax.swing.*;

public class BFrame extends JFrame {

    public BFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        Keyboard.init();
        addKeyListener(Keyboard.getKeyListener());

        Mouse.init();
        addMouseListener(Mouse.getMouseListener());
        addMouseMotionListener(Mouse.getMouseMotionListener());
        addMouseWheelListener(Mouse.getMouseWheelListener());

    }

}
