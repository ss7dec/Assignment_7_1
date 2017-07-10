//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//Convert using DecimalFormat
//The class java.text.DecimalFormat is a class that formats a number to a String.


package assignment_7_1;

import java.text.DecimalFormat;
public class TextDecimalFormat {
	public static void main(String args[])
	  {
	    int e = 19345;
	    DecimalFormat df = new DecimalFormat("##,###");
	    String str5 = df.format(e);
	    System.out.println(str5);
	  }
}

//Using this method, you can specify the number of decimal places and comma separator for readability.