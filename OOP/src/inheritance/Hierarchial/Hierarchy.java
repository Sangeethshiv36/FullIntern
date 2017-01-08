//Hierrarchial Inheritance

package inheritance.Hierarchial;

public class Hierarchy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports cricket = new Cricket();
		
		cricket.teamSize(cricket);
		cricket.worldCup(cricket);
		cricket.matchLength(cricket);
		System.out.println("*************");
		Sports footBall = new FootBall();
		footBall.worldCup(footBall);
		footBall.matchLength(footBall);
		}

}
