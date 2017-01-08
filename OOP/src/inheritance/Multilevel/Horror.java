package inheritance.Multilevel;

class Horror extends Movie{
	private String rating = "UA";
	public void genre(){
		System.out.println("Movie Genre : Horror");
	}
	
	public void length(){
		System.out.println("Movie Duration : 90 mins");
	}
	
	public void rating(){
		System.out.println("Movie Rating :"+rating);
	}
}