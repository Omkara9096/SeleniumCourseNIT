package javaExamples;

public class OverRide1 extends OverRide{
	
	public void add(int a, int b) {
		
		System.out.println(a*b);
		System.out.println("Child - New Car");
	}
	
	public static void main(String[] args) {
		OverRide1 obj = new OverRide1();
		obj.add(10, 20);
	}

}
