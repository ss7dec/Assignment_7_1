//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.


//All of the examples above use the base (radix) 10. Following are convenient methods to convert to 
//binary, octal, and hexadecimal system. Arbitrary custom number system is also supported.

//Hexadecimal



package assignment_7_1;

public class ConversionWtSplRadix_Hexadecimal {
	  public static void main(String args[])
	  {
	    int j = 255;
	    String hexString = Integer.toHexString(j);
	    System.out.println(hexString);
	  }
}
