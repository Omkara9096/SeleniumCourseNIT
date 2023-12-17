package javaExamples;

public class Hello1 {
	
	public void m1() {
		System.out.println("M1 method executed");
	}
	
	public void m2() {
		System.out.println("M2 method executed");
	}
	
	public void m3() {
		System.out.println("M3 method executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method executed");
		// Create Object to access methods : syntax
		//  classname objectname = new classname();
		
		Hello1 m = new Hello1();
		m.m1();
		m.m2();
		m.m3();
		
	}

}
