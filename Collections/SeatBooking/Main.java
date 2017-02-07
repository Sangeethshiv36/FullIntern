package SeatBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("Palazzo",8,12);
		theatre.getSeats();
		if(theatre.reserveSeat("G12")){
			System.out.println("Please pay");
		}
		else{
			System.out.println("Seat's already taken");
		}
		if(theatre.reserveSeat("G12")){
			System.out.println("Please pay");
		}
		else{
			System.out.println("Seat's already taken");
		}
//		Set a = new HashSet();
//		a.add(new HashMap());
//		a.add(new ArrayList());
//		a.add("Angeeth");
//		System.out.println(a);
	}

}
