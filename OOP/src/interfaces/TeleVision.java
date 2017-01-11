package interfaces;

class TeleVision implements RemoteController {

	@Override
	public void on() {
		System.out.println("TeleVision is turned on");

	}

	@Override
	public void off() {
		System.out.println("Television is turned off");

	}

	@Override
	public void increase() {
		System.out.println("Television voulme Increased");

	}

	@Override
	public void decrease() {
		System.out.println("Television volume Decreased");

	}

}