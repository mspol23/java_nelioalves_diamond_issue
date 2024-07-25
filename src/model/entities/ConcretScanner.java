package model.entities;

public class ConcretScanner extends Device implements Scanner {

	public ConcretScanner() {
		super();
	}

	public ConcretScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("ConcretScanner processDoc working: " + doc);
	}
	
	@Override
	public void scan(String doc) {
		System.out.println("ConcretScanner scan working: " + doc);
	}
}
