//Just some workaround to get most of the OOP Concepts in one place.Don't mind the inefficiency of this program.

package oop;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		TicketReservationSystem bus = new BusTicketBooking();
		bus.selectType(bus);
		bus.verifyProof();
		bus.setDate("13/01/2017", "17/01/2017");
		bus.filterFare(800);
		bus.selectSeat(32);
		System.out.println();
		System.out.println("************ ---------- ************");
		System.out.println();
		RailwayTicketBooking train = new RailwayTicketBooking();
		train.selectType(train);
		train.verifyProof();
		train.setDate("666666", "91992");
		train.selectSeat(90);
		train.seatPreference("Lower");
	}

}
