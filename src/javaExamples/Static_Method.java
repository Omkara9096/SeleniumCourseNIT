package javaExamples;

public class Static_Method {
	
	int b=20;		// Instance Var
	static int empid = 101;		// Static Var
	
	public void m1() {
		
	//  DT  Var  VV
		int a = 10;			// Local Var
		System.out.println("m1 is executed...");
		System.out.println(a + " : Local Var");      //10
		
	}
	
	public void m2() {
		
		System.out.println("m2 is executed");
		System.out.println(b + " : Instance Var");
		System.out.println(empid + " : static var");
	
	}
	
	public void m3() {
		System.out.println("m3 is executed");
		System.out.println(b + " : Instance Var");
		System.out.println(empid + " : static var");
		
	}
	
	public static void st(){
		System.out.println("Static Method executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method is executed");
		
		// Non - Static method is accessed by using Object
		
		Static_Method st1 = new Static_Method();
		
		st1.m1();
		st1.m2();
		st1.m3();
		
		Static_Method.st();  			// Static method is access by using classname
		
		
	}
	

}
