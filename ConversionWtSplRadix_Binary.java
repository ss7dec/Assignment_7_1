//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//All of the examples above use the base (radix) 10. Following are convenient methods to convert to 
//binary, octal, and hexadecimal system. Arbitrary custom number system is also supported.

//Binary
package assignment_7_1;

public class ConversionWtSplRadix_Binary {
	public static void main(String args[])
	  {
	    int h = 255;
	    String binaryString = Integer.toBinaryString(h);
	    System.out.println(binaryString);
	  }
}
