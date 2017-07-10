//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.


//There are different methodologies regarding the conversion of Java Int to String. Performing conversion 
//from int to String is a common scenario when programming with Core Java. 

//Here are some quick reference example codes:
//•	Convert using Integer.toString(int)
//•	Convert using String.valueOf(int)
//•	Convert using new Integer(int).toString()
//•	Convert using String.format()
//•	Convert using DecimalFormat
//•	Convert using StringBuffer or StringBuilder
//•	Convert with special radix (not base 10 system)



//The String class has several static methods that can convert most primitive types 
//to their String representation. This includes integers.


package assignment_7_1;

public class String_Demo {
	public static void main(String[] args) {

		  int i = -756;

		//Integer to String  conversion

		   String str = String.valueOf(i);

		System.out.println("This is Integer to String conversion " + str);

		int i_am_int = 756;

		//Integer to String conversion

		   String str1 = String.valueOf(i_am_int);

		    System.out.println("This is the conversion from Integer to String " + str1);


   }
}

//This is also an efficient solution like the first option above. And because this is simple and efficient, it is also
//a very popular method for converting an int to String. 
