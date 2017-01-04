//Just a Silly Program to Implement important OOP concepts.

class LunchBox implements LunchBoxFunctions { //LunchBox Class Implementing Interface

	@Override
	public void open() {//method in interface
		System.out.println("LunchBox Open Function");
	}

	@Override
	public void close() {//method in interface
		System.out.println("LunchBox Close Function");
	}

}

class BoxA extends LunchBox { // Box A -- child class , LunchBox -- parent class
	public void open() {//overriding method in LunchBox(Parent)
		System.out.println("Box A Opened");
	}

	public void food(String a) {//own method with string 'Parameter'
		System.out.println("Box A has " + a + " in it");
	}

	public void close() {//overriding parent method
		System.out.println("Box A closed");
	}
}

class BoxB extends BoxA {// parent class -- BoxA , Interface -- LunchBoxFunctions
	
	public void open(){//overriding parent method
		System.out.println("Box B Opened");
	}
	public void food(String a) {//overriding parent method
		System.out.println("Box B has " + a + " in it");
	}
	public void close(){//overriding parent method
		System.out.println("Box B Closed");
	}
}

public class Lunch {

	public static void main(String[] args) { //Main Function
		// TODO Auto-generated method stub
		//Object Instantiation and Function calling
		LunchBox lb= new LunchBox(); //SuperClass Instantiation 
 		lb.open();//calling superclass function 'open'
 		
		LunchBox ba = new BoxA();//polymorphism -- Parent type reference to Child class object(Upcasting)
		BoxA bc= (BoxA) ba;//Down casting -- Casting subclass to superclass to use the subclass method 
		ba.open();
		bc.food("Sandwich"); // With the help of Down casting,i am able to call subclass method.
		
		BoxA bb = new BoxB();
		bb.open();
		BoxB bd = (BoxB) bb;//down casting here as well
		bd.food("Burger");	
		bd.close();//closing
		ba.close();
		lb.close();
	}

}
