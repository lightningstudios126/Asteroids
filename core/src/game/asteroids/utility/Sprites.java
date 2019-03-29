package game.asteroids.utility;

public class Sprites {
	private static final String DIRECTORY = "entities/";
	private static final String FILE_FORMAT = ".png";

	public static final String PLAYER_SPRITE = DIRECTORY + "ship" + FILE_FORMAT;
	public static final String PLAYER_BURN = DIRECTORY + "ship_burn" + FILE_FORMAT;

	public static final String BULLET_PLAYER = DIRECTORY + "bullet_player" + FILE_FORMAT;
	public static final String BULLET_SAUCER = DIRECTORY + "bullet_saucer" + FILE_FORMAT;

	public static final String ASTEROID_LARGE = DIRECTORY + "asteroid_large" + FILE_FORMAT;
	public static final String ASTEROID_MEDIUM = DIRECTORY + "asteroid_medium" + FILE_FORMAT;
	public static final String ASTEROID_SMALL = DIRECTORY + "asteroid_small" + FILE_FORMAT;

	public static final float PIXELS_PER_METER = 32;
}
