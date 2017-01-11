//Hierrarchial Inheritance

package inheritance.Hierarchial;

public class Hierarchy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports cricket = new Cricket();

		cricket.showTeamSize(cricket);
		cricket.winningTrophy(cricket);
		cricket.showMatchLength(cricket);
		System.out.println("*************");
		Sports footBall = new FootBall();
		footBall.winningTrophy(footBall);
		footBall.showMatchLength(footBall);
	}

}
