package abstractclasses.SecondExample;

abstract class VendingMachine{
	public void makeCoke(){
		System.out.println("Making Coke");
	}
	
	public void makePepsi(){
		System.out.println("Making Pepsi");
	}
	
	abstract void pressButton(String a);
	
}

class Drinks extends VendingMachine{
	public void pressButton(String a){
		if(a.equalsIgnoreCase("Coke"))
			makeCoke();
		else
			makePepsi();
	}
	
}
public class SecondExampls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinks drink = new Drinks();
		System.out.println("Enter Choice:Coke or Pepsi");
		drink.pressButton("coke");
		drink.pressButton("pepsi");
	}
}
