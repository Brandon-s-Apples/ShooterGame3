package inputs;

import types.code.Coordinate;

public class Constants {

    // src/game/Entity.java
    public static final int entityDefaultStandWidth = 100, entityDefaultStandHeight = 50;

    // src/game/Game.java
    public static final long gameLoopTimeMillis = 15;

    // src/game/Main.java
    public static final int mainFrameWidth = 1900, mainFrameHeight = 1100;

    // src/game/Player.java
    public static final Coordinate playerSpawn = new Coordinate(0, 0);
    public static final double playerStandWidth = 100, playerStandHeight = 50;
    public static final double playerAcceleration = 5, playerDeceleration = 0.5, playerMaxSpeed = 5;

    // src/inputs/Keyboard.java
    public static final int supportedKeys = 4;
    public static final int keyboardW = 0, keyboardA = 1, keyboardS = 2, keyboardD = 3;

}
