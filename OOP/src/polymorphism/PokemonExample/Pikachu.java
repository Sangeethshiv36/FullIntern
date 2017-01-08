package polymorphism.PokemonExample;

class Pikachu extends Pokemon{
	public void throwBall(){
		System.out.println("Pikachu! I choose you");
	}
	
	public void attack(String att){
		System.out.println("PIKACHU!!" +att+"!!!" );
	}
}