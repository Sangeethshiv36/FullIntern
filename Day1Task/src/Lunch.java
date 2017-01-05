//Just a Silly Program to Implement important OOP concepts.

public class Lunch {

	public static void main(String[] args) { // Main Function
		// TODO Auto-generated method stub
		// Object Instantiation and Function calling
		Box pobj = new Box(); // SuperClass Instantiation
		pobj.open();// calling superclass function 'open'

		Box cobj = new BoxA();// polymorphism -- Parent type reference to
									// Child class object(Upcasting)
		BoxA castingObj = (BoxA) cobj;// Down casting -- Casting subclass to superclass to
							// use the subclass method
		cobj.open();
		castingObj.contains("Sandwich"); // With the help of Down casting,i am able to
									// call subclass method.

		BoxA spobj = new BoxB();
		spobj.open();
		BoxB scobj = (BoxB) spobj;// down casting here as well
		scobj.contains("Burger");
		spobj.close();// closing
		cobj.close();
		pobj.close();
	}

}
