package javaExamples;

public class ExcepHand {
	
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
