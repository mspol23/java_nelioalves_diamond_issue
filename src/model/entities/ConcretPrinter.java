package model.entities;

public class ConcretPrinter extends Device implements Printer {

	public ConcretPrinter() {
		super();
	}

	public ConcretPrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("ConcretPrinter print called: " + doc);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("ConcretPrinter processDoc called: " + doc);
		
	}
}
