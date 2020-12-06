package main.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard {

    public static final int supportedKeys = 4;
    public static final int w = 0, s = 1, a = 2, d = 3;
    private static boolean[] keys;

    private static KeyListener keyListener;

    public static void init() {
        keys = new boolean[supportedKeys];
        for(int i = 0; i < supportedKeys; i++) keys[i] = false;

        keyListener = new KeyListener() {
            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {
                switch(e.getKeyChar()) {
                    case 'w': keys[w] = true; break;
                    case 's': keys[s] = true; break;
                    case 'a': keys[a] = true; break;
                    case 'd': keys[d] = true; break;

                }

            }

            public void keyReleased(KeyEvent e) {
                switch(e.getKeyChar()) {
                    case 'w': keys[w] = false; break;
                    case 's': keys[s] = false; break;
                    case 'a': keys[a] = false; break;
                    case 'd': keys[d] = false; break;

                }

            }

        };

    }

    public KeyListener getKeyListener() {
        return keyListener;

    }

    public boolean getKey(int key) {
        return keys[key];

    }

}
