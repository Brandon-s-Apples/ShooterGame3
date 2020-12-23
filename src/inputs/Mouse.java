package inputs;

import types.code.Coordinate;
import types.graphics.BFrame;
import types.graphics.BLabel;

import javax.swing.*;
import java.awt.event.*;

public class Mouse {

    private static boolean[] buttons;
    private static Coordinate loc, referencePoint;
    private static MouseListener mouseListener;
    private static MouseMotionListener mouseMotionListener;
    private static MouseWheelListener mouseWheelListener;
    private static boolean isInFrame;
    private static BLabel mouseImage;

    private static boolean active = false;

    private Mouse() {}

    public static void init(JFrame frame) {
        if(!active) {
            active = true;
            buttons = new boolean[5];
            loc = new Coordinate();
            isInFrame = false;
            referencePoint = new Coordinate();
            mouseImage = new BLabel(frame, Constants.mouseImg);
            mouseImage.setBounds(0, 0);

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
                    mouseImage.setVisible(true);
                }

                public void mouseExited(MouseEvent e) {
                    isInFrame = false;
                    mouseImage.setVisible(false);
                }
            };

            mouseMotionListener = new MouseMotionListener() {
                public void mouseDragged(MouseEvent e) {
                    double wantedX = e.getX() - ((double) Constants.mainFrameWidth / 2) + Constants.xOffset + referencePoint.getX();
                    double wantedY = -(e.getY() - ((double) Constants.mainFrameHeight / 2) + Constants.yOffset + referencePoint.getY());
                    loc.setXY(wantedX, wantedY);
                    mouseImage.setBounds(wantedX - referencePoint.getX(), wantedY - referencePoint.getY());
                }

                public void mouseMoved(MouseEvent e) {
                    double wantedX = e.getX() - ((double) Constants.mainFrameWidth / 2) + Constants.xOffset + referencePoint.getX();
                    double wantedY = -(e.getY() - ((double) Constants.mainFrameHeight / 2) + Constants.yOffset + referencePoint.getY());
                    loc.setXY(wantedX, wantedY);
                    mouseImage.setBounds(wantedX - referencePoint.getX(), wantedY - referencePoint.getY());
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

    public static boolean getButton(int index) {
        return buttons[index];
    }

}
