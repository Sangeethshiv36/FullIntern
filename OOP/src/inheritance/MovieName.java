//Multilevel Inheritance

package inheritance;

class Movie {
	public Movie(){
		System.out.println("Class Movie");
	}
}

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
public class MovieName extends Horror {
	
		public MovieName(String movieName){
			System.out.println("Movie Name : " +movieName );
		}
		
		public void length(int length){
			System.out.println("Movie length : "+length+" mins");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieName conjuring = new MovieName("Conjuring");
		conjuring.length(90);
		conjuring.rating();
	}

}
