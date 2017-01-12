package oop;

class OnlineBookingApp {
	OnlineBookingApp(String type) {
		if (type.equalsIgnoreCase("bus"))
			System.out.println("APP :Red Bus");
		else if (type.equalsIgnoreCase("train"))
			System.out.println("APP :IRCTC");
		else
			System.out.println("Select valid Mode of Travel");
	}
}