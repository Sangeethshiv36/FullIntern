//Hierrarchial Inheritance

package inheritance;

class Sports{
	public Sports(){
		System.out.println("Class Sports");
	}
	
	public void teamSize(Object obj){
		if(obj instanceof Cricket)
		System.out.println("Team : 11 players Squad on field");
		else
		System.out.println("Team : 11 Player Squad including GoalKeeper");
	}
	
	public void matchLength(Object obj){
		if(obj instanceof Cricket)
		System.out.println("Depends on the number of overs,usually takes anywhere between 7 to 9hrs");
		else
		System.out.println("90mins,in case of extra time than its 120mins");
	}
	
	public void worldCup(Object obj){
		if(obj instanceof Cricket)
		System.out.println("Worldcup : ICC World Cup");
		else
		System.out.println("Worldcup : FIFA World Cup");
	}
}

class Cricket extends Sports{
	public Cricket(){
		System.out.println("Sport : Cricket");
	}
}
class FootBall extends Sports{
	public FootBall(){
		System.out.println("Sport : FootBall");
	}
}

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
