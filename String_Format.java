//Assignment 7.1

//Write a program to convert an int variable to String using an inbuilt function of String class.
//Display the int converted to String.


//Usage of format() method

package assignment_7_1;

import java.util.Scanner;

public class String_Format {
	public static void main(String[] args) {

		

		//User Integer Input

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Integer to Convert");

		int i1=sc.nextInt();

		       String str2 = String.format("%d", i1);

		System.out.println("Integer entered by user converted to String format method" + str2);

		System.out.println("Integer converted to String format method" + str2);

		   }

	//Integer entered by user converted to String format method 
	

	}

