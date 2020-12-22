package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard {

    private Keyboard() {
    }

    private static boolean active = false;

    private static boolean[] keys;
    private static KeyListener keyListener;

    public static void init() {
        if(!active) {
            active = true;
            keys = new boolean[Constants.supportedKeys];
            keyListener = new KeyListener() {
                public void keyTyped(KeyEvent e) {
                }

                public void keyPressed(KeyEvent e) {
                    switch(e.getKeyChar()) {
                        case 'w':
                            keys[Constants.keyboardW] = true;
                            break;
                        case 'a':
                            keys[Constants.keyboardA] = true;
                            break;
                        case 's':
                            keys[Constants.keyboardS] = true;
                            break;
                        case 'd':
                            keys[Constants.keyboardD] = true;
                            break;

                    }

                }

                public void keyReleased(KeyEvent e) {
                    switch(e.getKeyChar()) {
                        case 'w':
                            keys[Constants.keyboardW] = false;
                            break;
                        case 'a':
                            keys[Constants.keyboardA] = false;
                            break;
                        case 's':
                            keys[Constants.keyboardS] = false;
                            break;
                        case 'd':
                            keys[Constants.keyboardD] = false;
                            break;

                    }

                }
            };

        }

    }

    public static KeyListener getKeyListener() {
        return keyListener;
    }

    public static boolean getKey(char key) {
        switch(key) {
            case 'w':
                return keys[Constants.keyboardW];
            case 'a':
                return keys[Constants.keyboardA];
            case 's':
                return keys[Constants.keyboardS];
            case 'd':
                return keys[Constants.keyboardD];
            default:
                return false;

        }

    }

}
