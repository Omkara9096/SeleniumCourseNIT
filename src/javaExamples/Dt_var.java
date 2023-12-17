package javaExamples;

public class Dt_var {
	int b=20;	// Instance var
	static int empid = 101;	//static var
	
	public void m1() {
		// DT var vv
		
		int a = 10;
		System.out.println("m1 method executed");
		System.out.println("Local var : " + a);
	}
	
	public void m2() {
		System.out.println("m2 method executed");
		System.out.println("Instance var : " + b);
		System.out.println("static var : " + empid);
	}
	
	public void m3() {
		System.out.println("m3 method executed");
		System.out.println("Instance var : " + b);
		System.out.println("static var : " + empid);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method executed...");
		
		Dt_var m = new Dt_var();
		
		m.m1();
		m.m2();
		m.m3();
	}
	
	
}
