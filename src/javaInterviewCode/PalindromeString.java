package javaInterviewCode;

public class PalindromeString {

	//Return true if string is Palindrome
	static boolean isPalindrome(String str) {

		int i=0; int j=str.length()-1;

		while(i<j) {

			//if there is mismatch
			if(str.charAt(i)!=str.charAt(j))
				return false;

			//increment first pointer & Decrement last pointer
			i++;
			j--;

		}	
		return true;	
	}

	public static void main(String[] args) {

		String str = "Geeks";
		String str1 = "RACEcar";

		//change string to lowercase
		str = str.toLowerCase();
		str1 = str1.toLowerCase();

		//For string 1
		System.out.println("String 1: ");
		if (isPalindrome(str))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

		//For string 1
		System.out.println("String 2: ");
		if (isPalindrome(str1))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
