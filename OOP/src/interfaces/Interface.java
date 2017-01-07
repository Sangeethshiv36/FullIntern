package interfaces;

class TeleVision implements RemoteController{

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
public class Interface{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController remote = new TeleVision();
		remote.on();
		remote.increase();
		remote.decrease();
		remote.off();
		
		RemoteController acremote = new AirConditioner();
		acremote.on();
		acremote.increase();
		acremote.decrease();
		acremote.off();
	}

}
