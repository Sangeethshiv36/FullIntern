package oop;

class TicketReservationSystem implements TicketBooking {

	public void selectType(Object obj) {
		if (obj instanceof BusTicketBooking)
			System.out.println("Mode of Travel :Bus");
		else
			System.out.println("Mode of Travel :Railway");
	}

	public void verifyProof() {
		System.out.println("Proof Verified.");
	}

	@Override
	public void setDate(String journeyDate, String returnDate) {
		// TODO Auto-generated method stub
		System.out.println("Date of Joruney: " + journeyDate + "Date of Return: " + returnDate);
	}

	@Override
	public void filterFare(int fare) {
		// TODO Auto-generated method stub
		System.out.println("Amount to Filter :" + fare);
	}

	@Override
	public void selectSeat(int seatno) {
		// TODO Auto-generated method stub
		System.out.println("Seat No:" + seatno);
	}

}