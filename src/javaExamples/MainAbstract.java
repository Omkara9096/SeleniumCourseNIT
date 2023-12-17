package javaExamples;

abstract class Abstract_Class{
	
	public abstract void abstractMethod();		//abstract method 
	
	public static void staticMethod() { 		//Static method with implementation
		
		System.out.println("This static method is called using abstract class");
	}
}


public class MainAbstract {
	
	public static void main(String[] args) {
		
		Abstract_Class.staticMethod();
	}

}
