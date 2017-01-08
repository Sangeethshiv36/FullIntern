package interfaces;

class AirConditioner implements RemoteController{
	@Override
	public void on() {
		System.out.println("Ac is turned on");
		
	}

	@Override
	public void off() {
		System.out.println("AC is turned off");
		
	}

	@Override
	public void increase() {
		System.out.println("AC Temp  Increased");
		
	}

	@Override
	public void decrease() {
		System.out.println("Ac Temp  Decreased");
		
	}
}