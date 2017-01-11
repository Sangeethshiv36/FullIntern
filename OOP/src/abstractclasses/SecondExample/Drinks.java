package abstractclasses.SecondExample;

class Drinks extends VendingMachine {
	public void pressButton(String a) {
		if (a.equalsIgnoreCase("Coke"))
			makeCoke();
		else
			makePepsi();
	}

}