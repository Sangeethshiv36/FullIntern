//Single Inheritance --

package inheritance.Single;

public class Son extends Father {

	public void work() {
		System.out.println("He naps all day!");
	}

	public void work(String a) {
		System.out.println("He is a " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		Father firstSon = new Son();
		Son secondSon = new Son();

		System.out.println(father.showDetails());
		System.out.println(firstSon.showDetails());

		father.work();
		firstSon.work();
		secondSon.work("Student");
	}

}
