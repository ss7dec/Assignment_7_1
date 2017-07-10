//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.


//String Builder Example	

//StringBuilder works similarly but not thread safe like StringBuffer.

package assignment_7_1;

public class String_Builder_Eg {
	public static void main(String args[])
	  {
	    int g = 34579;
	    StringBuilder sb = new StringBuilder();
	    sb.append(g);
	    String str = sb.toString();
	    System.out.println("String str = " + str);
	  }
}
