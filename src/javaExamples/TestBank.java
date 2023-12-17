package javaExamples;

// Abstract Class Examples

abstract class Bank{
	abstract void debit();
	abstract void credit();
	
}

class HDFC extends Bank{
	public void debit() {
		System.out.println("HDFC Debit");
	}
	
	public void credit() {
		System.out.println("HDFC Credit");
	}
}

class IDBI extends Bank{
	public void debit() {
		System.out.println("IDBI Debit");
	}
	
	public void credit() {
		System.out.println("IDBI Credit");
	}
}
public class TestBank {
public static void main(String[] args) {
	HDFC hd = new HDFC();
	hd.debit();
	hd.credit();
	
	IDBI ic = new IDBI();
	ic.debit();
	ic.credit();
	
}
}
