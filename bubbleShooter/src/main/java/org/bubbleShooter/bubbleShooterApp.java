package org.bubbleShooter;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class bubbleShooterApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {

        gameSettings.setTitle("Bubble Shooter");
        gameSettings.setVersion("0.1");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
