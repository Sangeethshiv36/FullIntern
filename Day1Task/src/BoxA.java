class BoxA extends Box { // Box A -- child class , LunchBox -- parent class
	public void open() {//overriding method in LunchBox(Parent)
		System.out.println("Box A Opened");
	}

	public void contains(String a) {//own method with string 'Parameter'
		System.out.println("Box A has " + a + " in it");
	}

	public void close() {//overriding parent method
		System.out.println("Box A closed");
	}
}