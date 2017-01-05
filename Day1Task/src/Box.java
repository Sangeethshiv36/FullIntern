class Box implements LunchBox { //LunchBox Class Implementing Interface

	@Override
	public void open() {//method in interface
		System.out.println("LunchBox Open Function");
	}

	@Override
	public void close() {//method in interface
		System.out.println("LunchBox Close Function");
		
	}

}