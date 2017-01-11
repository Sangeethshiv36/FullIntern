package inheritance.Single;

class Father {
	private String hairColor = "Black";
	private String pupilColor = "Blue";

	public void work() {
		System.out.println("He works as a Software Dev");
	}

	public String showDetails() {
		return "His HairColor is " + hairColor + " and Pupil Color is " + pupilColor;
	}
}