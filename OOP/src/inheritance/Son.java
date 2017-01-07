//Single Inheritance

package inheritance;

class Father{
	private String hairColor = "Black";
	private String pupilColor = "Blue";
	
	public void work(){
		System.out.println("He works as a Software Dev");
	}
	
	
	
	public String looks(){
		return "His HairColor is " + hairColor + " and Pupil Color is "+pupilColor;
	}	
}

public class Son extends Father {
	
		public void work(){
			System.out.println("He naps all day!");
		}
		
		public void work(String a){
			System.out.println("He is a "+a);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		Father firstSon = new Son();
		Son secondSon =new Son();
		
		System.out.println(father.looks());
		System.out.println(firstSon.looks());
		
		father.work();
		firstSon.work();
		secondSon.work("Student");
	}

}
