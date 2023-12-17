package javaExamples;

import java.util.Scanner;

public class Exp_Add {
	
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("Enter a & b values");
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
		}
		c = a + b;
		
		System.out.println("Addition of a and b : " + c);
		
	}
}
