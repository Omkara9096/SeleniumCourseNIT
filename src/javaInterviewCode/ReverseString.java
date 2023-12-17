package javaInterviewCode;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Geeks";
		
		//Conversion from string to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		
		//To reverse the string
		sbr.reverse();
		
		System.out.println("Reverse String : " + sbr);
		
	}
}
