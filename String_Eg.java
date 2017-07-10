//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.


//Convert using Integer.toString(int)

//The Integer class has a static method that returns a String object representing the specified int parameter.
//Syntax :
//public static String toString(int i)
//The argument i is converted and returned as a string instance. If the number is negative, 
//the sign will be preserved.


package assignment_7_1;

public class String_Eg {
	public static void main(String args[])
	  {
	    int a = 1234;
	    int b = -1234;
	        
	    
	    String str1 = Integer.toString(a);
	    String str2 = Integer.toString(b);
	    System.out.println("String str1 = " + str1); 
	    System.out.println("String str2 = " + str2);
	  }
}
