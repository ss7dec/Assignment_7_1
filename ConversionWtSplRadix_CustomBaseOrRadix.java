//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//Custom Base/Radix
//you can use any other custom base/radix when converting an int to String.
//Following example uses the base 7 number system.


package assignment_7_1;

public class ConversionWtSplRadix_CustomBaseOrRadix {
	public static void main(String args[])
	  {
	    int k = 255;
	    String customString = Integer.toString(k, 7);
	    System.out.println(customString);
	  }
}
