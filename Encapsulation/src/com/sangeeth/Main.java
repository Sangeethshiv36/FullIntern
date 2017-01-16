package com.sangeeth;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(30, false);
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " Printer print count = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(8);
		System.out.println("Pages printed was " + pagesPrinted + " Printer print count = " + printer.getPagesPrinted());
	}

}
