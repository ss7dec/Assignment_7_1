//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//All of the examples above use the base (radix) 10. Following are convenient methods to convert to 
//binary, octal, and hexadecimal system. Arbitrary custom number system is also supported.

//Octal


package assignment_7_1;

public class CoversionWtSplRadix_Octal {
	public static void main(String args[])
	  {
	    int i = 255;
	    String octalString = Integer.toOctalString(i);
	    System.out.println(octalString);
	  }
}
