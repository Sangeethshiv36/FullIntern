package polymorphism.PokemonExample;

class Bulbasaur extends Pokemon{
	public void throwBall(){
		System.out.println("Bulbasaur! I choose you");
	}
	
	public void attack(String att,int type){
		System.out.println("BULBASAUR!! Type "+type+" "+att);
	}
}