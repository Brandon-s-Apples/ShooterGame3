package inputs;

import types.code.Coordinate;

import java.awt.event.*;

public class Mouse {

    private static boolean[] buttons;
    private static Coordinate loc, referencePoint;
    private static MouseListener mouseListener;
    private static MouseMotionListener mouseMotionListener;
    private static MouseWheelListener mouseWheelListener;
    private static boolean isInFrame;

    private static boolean active = false;

    private Mouse() {}

    public static void init() {
        if(!active) {
            active = true;
            buttons = new boolean[5];
            loc = new Coordinate();
            isInFrame = false;
            referencePoint = new Coordinate();

            mouseListener = new MouseListener() {
                public void mouseClicked(MouseEvent e) {}

                public void mousePressed(MouseEvent e) {
                    buttons[e.getButton() - 1] = true;
                }

                public void mouseReleased(MouseEvent e) {
                    buttons[e.getButton() - 1] = false;
                }

                public void mouseEntered(MouseEvent e) {
                    isInFrame = true;
                }

                public void mouseExited(MouseEvent e) {
                    isInFrame = false;
                }
            };

            mouseMotionListener = new MouseMotionListener() {
                public void mouseDragged(MouseEvent e) {
                    double wantedX = e.getX() - ((double) Constants.mainFrameWidth / 2) + Constants.xOffset + referencePoint.getX();
                    double wantedY = -(e.getY() - ((double) Constants.mainFrameHeight / 2) + Constants.yOffset + referencePoint.getY());
                    loc.setXY(wantedX, wantedY);
                }

                public void mouseMoved(MouseEvent e) {
                    double wantedX = e.getX() - ((double) Constants.mainFrameWidth / 2) + Constants.xOffset + referencePoint.getX();
                    double wantedY = -(e.getY() - ((double) Constants.mainFrameHeight / 2) + Constants.yOffset + referencePoint.getY());
                    loc.setXY(wantedX, wantedY);
                }
            };

            mouseWheelListener = e -> {

            };

        }

    }

    public static void setReferencePoint(Coordinate loc) {
        Mouse.referencePoint = loc;
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
