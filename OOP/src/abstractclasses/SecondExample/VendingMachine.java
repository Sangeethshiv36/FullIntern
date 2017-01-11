package abstractclasses.SecondExample;

abstract class VendingMachine {
	public void makeCoke() {
		System.out.println("Making Coke");
	}

	public void makePepsi() {
		System.out.println("Making Pepsi");
	}

	abstract void pressButton(String a);

}