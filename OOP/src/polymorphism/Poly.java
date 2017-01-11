package polymorphism;

class WashingMachine {
	public void on() {
		System.out.println("Washing Machine Powered ON");
	}

	public void off() {
		System.out.println("Switched OFF!");
	}
}

class Dry extends WashingMachine {
	public void on() {
		System.out.println("Drying Clothes");
	}
}

class Soak extends WashingMachine {
	public void on() {
		System.out.println("Soaking Clothes");
	}
}

public class Poly extends WashingMachine {

	public static void main(String[] args) {

		WashingMachine wash = new WashingMachine();
		wash.on();

		WashingMachine dry = new Dry();
		dry.on();

		WashingMachine soak = new Soak();
		soak.on();
		soak.off();

	}

}
