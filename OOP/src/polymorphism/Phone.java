//Compile time or Static polymorphism -- overloading

package polymorphism;

public class Phone {
	public void showFeautres(String call, String text) {
		System.out.println("Normal Phone");
		System.out.println("Functions" + call + " " + text);
	}

	public void showFeautres(String call, String text, String videocall, String games, int memory) {
		System.out.println("Smart Phone");
		System.out.println("Functions" + call + "," + text + "," + videocall + "," + games + "," + memory);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone functions = new Phone();
		functions.showFeautres("Calling", "Texting");
		functions.showFeautres("Calling", "Texting", "VideoCalling", "Gaming", 32);
	}

}
