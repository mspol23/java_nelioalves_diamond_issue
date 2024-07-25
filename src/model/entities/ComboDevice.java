package model.entities;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice() {
		super();
	}

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("ComboDevice in action: " + doc);
	}

	@Override
	public void scan(String doc) {
		System.out.println("Inside ComboDevice scan function: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Inside ComboDevice print function: " + doc);
	}
	
}
