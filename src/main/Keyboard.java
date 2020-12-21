package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard {

    private Keyboard() {}

    private static boolean active = false;

    private static boolean[] keys;
    private static KeyListener keyListener;

    public static void init() {
        if(!active) {
            active = true;
            keys = new boolean[Constants.supportedKeys];
            keyListener = new KeyListener() {
                public void keyTyped(KeyEvent e) {}
                public void keyPressed(KeyEvent e) {
                    switch(e.getKeyChar()) {
                        case 'w': keys[Constants.wKey] = true; break;
                        case 'a': keys[Constants.aKey] = true; break;
                        case 's': keys[Constants.sKey] = true; break;
                        case 'd': keys[Constants.dKey] = true; break;

                    }

                }
                public void keyReleased(KeyEvent e) {
                    switch(e.getKeyChar()) {
                        case 'w': keys[Constants.wKey] = false; break;
                        case 'a': keys[Constants.aKey] = false; break;
                        case 's': keys[Constants.sKey] = false; break;
                        case 'd': keys[Constants.dKey] = false; break;

                    }

                }
            };

        }

    }

}
