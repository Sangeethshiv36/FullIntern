package inheritance.Hierarchial;

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
