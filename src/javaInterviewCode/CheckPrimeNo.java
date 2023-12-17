package javaInterviewCode;

import java.util.Scanner;

public class CheckPrimeNo {
	
	public static void main(String[] args){
		
		//Create scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int num = sc.nextInt();		//Accept user input from Keyboard
		
		int i=2;		// i value initiaze by just 2 bcz every no is divisible by 1
		
		while(num>0) {				//Loop continues till num to 0
			
			if(num%i==0)		//Number is checked by i if we get 0 then Number is not prime
				break;
			
			i++;				//then will chech for next iteration
			
		}
		
		if(num == i)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}

}
