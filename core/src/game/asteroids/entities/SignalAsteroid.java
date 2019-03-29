package game.asteroids.entities;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import game.asteroids.PhysicsEngine;
import game.asteroids.utility.Sprites;

public class SignalAsteroid extends Entity implements Destructable {
    
    Runnable action;
    
    public SignalAsteroid(PhysicsEngine engine, Vector2 position, Runnable action) {
        super(engine, false, BodyDef.BodyType.KinematicBody);
    
        initialize(Sprites.ASTEROID_MEDIUM, CollisionHandler.LAYER_ASTEROIDS);
        body.setTransform(position, body.getAngle());
        this.action = action;
    }
    
    @Override
    public int getPointValue() {
        return 0;
    }
    
    @Override
    public void onDestroy() {
        action.run();
    }
    
    @Override
    public void update() {
    
    }
}