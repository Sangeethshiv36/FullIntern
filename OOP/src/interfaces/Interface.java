//

package interfaces;

public class Interface {

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
