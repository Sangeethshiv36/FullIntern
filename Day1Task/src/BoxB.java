class BoxB extends BoxA {// parent class -- BoxA , Interface -- LunchBoxFunctions
	
	public void open(){//overriding parent method
		System.out.println("Box B Opened");
	}
	public void contains(String a) {//overriding parent method
		System.out.println("Box B has " + a + " in it");
	}
	public void close(){//overriding parent method
		System.out.println("Box B Closed");
	}
}
