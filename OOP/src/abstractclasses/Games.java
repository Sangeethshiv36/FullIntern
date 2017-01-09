package abstractclasses;

abstract class Games {
	public void start(){
		System.out.println("Press Enter to Start!");
	}
	public void pause(){
		System.out.println("Press Esc to Pause!");
	}
	public void stop(){
		System.out.println("Press Alt+F4 to Quit!");
	}
	abstract void jump();
	abstract void drive();
}