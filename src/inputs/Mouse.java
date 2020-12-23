package inputs;

import types.code.Coordinate;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

public class Mouse {

    private static boolean[] buttons;
    private static Coordinate loc, referencePoint;
    private static MouseListener mouseListener;
    private static MouseMotionListener mouseMotionListener;
    private static MouseWheelListener mouseWheelListener;
    private static boolean isInFrame;

    private static boolean active = false;

    private Mouse() {}

    public static void init(Coordinate referencePoint) {
        if(!active) {
            active = true;
            buttons = new boolean[5];
            loc = new Coordinate();
            isInFrame = false;
            Mouse.referencePoint = referencePoint;

            mouseListener = new MouseListener() {
                public void mouseClicked(MouseEvent e) {}

                public void mousePressed(MouseEvent e) {
                    buttons[e.getButton()] = true;
                    System.out.println(e.getButton());
                }

                public void mouseReleased(MouseEvent e) {
                    buttons[e.getButton()] = false;
                }

                public void mouseEntered(MouseEvent e) {
                    isInFrame = true;
                }

                public void mouseExited(MouseEvent e) {
                    isInFrame = false;
                }
            };

            mouseMotionListener = new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    double wantedX = e.getX() - ((double) Constants.mainFrameWidth / 2) + Constants.xOffset + referencePoint.getX();
                    double wantedY = -(e.getY() - ((double) Constants.mainFrameHeight / 2) + Constants.yOffset + referencePoint.getY());
                    loc.setXY(wantedX, wantedY);
                    System.out.println(wantedX + ", " + wantedY);
                }

                @Override
                public void mouseMoved(MouseEvent e) {

                }
            };

        }

    }

    public static MouseListener getMouseListener() {
        return mouseListener;
    }

    public static MouseMotionListener getMouseMotionListener() {
        return mouseMotionListener;
    }

    public static MouseWheelListener getMouseWheelListener() {
        return mouseWheelListener;
    }

}
