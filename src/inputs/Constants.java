package inputs;

public class Constants {

    // src/game/Game.java
    public static final long gameLoopTimeMillis = 15;

    // src/game/Main.java
    public static final int mainFrameWidth = 1900, mainFrameHeight = 1100;

    // src/game/Player.java
    public static final double playerSpawnX = 0, playerSpawnY = 0;
    public static final double playerStandWidth = 100, playerStandHeight = 50;
    public static final double playerAcceleration = 5, playerDeceleration = 0.5, playerMaxSpeed = 20;

    // src/inputs/Keyboard.java
    public static final int supportedKeys = 4;
    public static final int keyboardW = 0, keyboardA = 1, keyboardS = 2, keyboardD = 3;

}
