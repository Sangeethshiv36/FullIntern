package polymorphism.PokemonExample;

public class Pokeball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pika = new Pikachu();
		pika.throwBall();
		pika.attack("IRON TAIL!");

		Bulbasaur bulba = new Bulbasaur();
		bulba.throwBall();
		bulba.attack("RAZORLEAF!", 2);

	}

}
