package oop;

class RailwayTicketBooking extends TicketReservationSystem {

	public RailwayTicketBooking() {
		System.out.println("Type : Train");
	}

	public void seatPreference(String berth) {
		System.out.println("Seat Preference :" + berth);
	}

	OnlineBookingApp irctc = new OnlineBookingApp("TrAin");
}