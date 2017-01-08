//Runtime or Dynamic Polymorphism -- Overriding

package polymorphism.RuntimePolymorphism;

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
