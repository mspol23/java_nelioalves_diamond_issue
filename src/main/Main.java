package main;

import model.entities.ComboDevice;
import model.entities.ConcretPrinter;
import model.entities.ConcretScanner;

public class Main {

	public static void main(String[] args) {

		ComboDevice c1 = new ComboDevice("1001");
		c1.processDoc("combo");
		c1.print("combo");
		c1.scan("combo");
		
		ConcretPrinter cp = new ConcretPrinter("2002");
		cp.processDoc("printer");
		cp.print("printer");

		ConcretScanner cs = new ConcretScanner("3003");
		cs.scan("scanning");
		cs.processDoc("scanning");
		
	}

}
