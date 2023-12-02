package org.bubbleShooter;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.Entity;
import org.bubbleShooter.factories.BubbleShooterFactory;
import org.bubbleShooter.utilities.GameUtilities;

import java.util.Map;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getGameWorld;
import static com.almasb.fxgl.dsl.FXGLForKtKt.spawn;

public class BubbleShooterApp extends GameApplication {

    private Entity playerShip;
    @Override
    protected void initSettings(GameSettings gameSettings) {

        gameSettings.setTitle("Bubble Shooter");
        gameSettings.setVersion("0.1");
    }

    @Override
    protected void initInput() {
        super.initInput();
    }

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        super.initGameVars(vars);
    }

    @Override
    protected void initGame() {
       getGameWorld().addEntityFactory(new BubbleShooterFactory());
        GameUtilities.spawnShip(playerShip);

    }

    @Override
    protected void initPhysics() {
        super.initPhysics();
    }

    @Override
    protected void initUI() {
        super.initUI();
    }

    @Override
    protected void onUpdate(double tpf) {
        super.onUpdate(tpf);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
