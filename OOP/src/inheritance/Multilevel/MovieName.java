//Multilevel Inheritance

package inheritance.Multilevel;

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
