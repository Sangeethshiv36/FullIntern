package abstractclasses;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrashBandicootRace game = new CrashBandicootRace();
		Games.start();
		game.jump();
		game.drive();
		game.pause();
		Games.start();
		game.drive();
		game.stop();
	}

}
