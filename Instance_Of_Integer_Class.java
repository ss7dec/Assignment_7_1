//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.



//Convert using Integer(int).toString()
//This methods uses instance of Integer class to invoke it’s toString() method.

package assignment_7_1;

public class Instance_Of_Integer_Class {
	public static void main(String args[])
	  {
	    int d = 999;
	    Integer obj = new Integer(d);
	    String str4 = obj.toString();
	    System.out.println("String str4 = " + str4);
	  }
}

//If your variable is of primitive type (int), it is better to use Integer.toString(int) or String.valueOf(int). 
//But if your variable is already an instance of Integer (wrapper class of the primitive type int), it is better 
//to just invoke it’s toString() method as shown above.
//This method is not efficient as instance of Integer class is created before conversion is performed.