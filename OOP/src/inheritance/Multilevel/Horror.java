package inheritance.Multilevel;

class Horror extends Movie {
	private String rating = "UA";

	public void showGenre() {
		System.out.println("Movie Genre : Horror");
	}

	public void showLength() {
		System.out.println("Movie Duration : 90 mins");
	}

	public void showRating() {
		System.out.println("Movie Rating :" + rating);
	}
}