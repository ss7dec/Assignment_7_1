//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//String Buffer Example

//StringBuffer is a class that is used to concatenate multiple values into a String.


package assignment_7_1;

public class String_Buffer_Eg {
	public static void main(String args[])
	  {
	    int f = 1234;
	    StringBuffer sb = new StringBuffer();
	    sb.append(f);
	    String str = sb.toString();
	    System.out.println("String str = " + str);
	  }
}
