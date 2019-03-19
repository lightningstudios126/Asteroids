package game.asteroids;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import game.asteroids.Input.Input;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Player extends Entity{
	private final float turnSpeed = 20f;
	private final float speed = 10f;
	private final float maxSpeed = 5f;

	public static int lives;
	public static int score;

	private Vector2 direction;

	public Player(World world, BodyEditorLoader loader){
		super(world);

		FixtureDef fix = new FixtureDef();
		fix.density = 10;
		fix.friction = 0.5f;
		fix.restitution = 0.3f;

		loader.attachFixture(body, "ship.png", fix, 1);

		direction = new Vector2(0, 1);
		position = new Vector2(0, 0);
	}

	public void update(){
		// Thrusting
		direction.setAngleRad(body.getAngle() + MathUtils.degreesToRadians * 90);

		if(Input.keyDown(Input.UP)){
			Vector2 thrust = direction.nor().scl(speed);
			body.applyForceToCenter(thrust, true);
		}

		body.setLinearVelocity(body.getLinearVelocity().clamp(0, maxSpeed));

		// Rotation
		body.setAngularVelocity(0);
		if(Input.keyDown(Input.LEFT)) body.applyTorque(turnSpeed, true);
		else if(Input.keyDown(Input.RIGHT)) body.applyTorque(-turnSpeed, true);
	}
}
