package types.graphics;

import inputs.Constants;
import inputs.Keyboard;
import inputs.Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BFrame extends JFrame {

    public BFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        Keyboard.init();
        addKeyListener(Keyboard.getKeyListener());

        Mouse.init(this);
        addMouseListener(Mouse.getMouseListener());
        addMouseMotionListener(Mouse.getMouseMotionListener());
        addMouseWheelListener(Mouse.getMouseWheelListener());

        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
        getContentPane().setCursor(blankCursor);

        setIconImage(Constants.windowIconImage.getImage());

    }

}
