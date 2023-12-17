package javaExamples;

class X{
	int a=10;
	int b=20;
	
	public void m1() {
		
		System.out.println("m1 method is executed");
		
	}
	

}
class A extends X{
	public void test() {
		
		System.out.println("Hi..");
		System.out.println("Its a parent class");
		System.out.println(a+b);
		
		
	}
}

public class B extends A{		// single level inheritance + multilevel inheritance 
	
public static void main(String[] args) {
	B s = new B();
	s.test();
	s.m1();
	}
}
