package alcohalcheck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Legalagetodrink {
	private static int age;	

	public static void main (String [] aggs) {
		Legalagetodrink la = new Legalagetodrink();
		la.CheckAge();
		/* This is a program to check legality of Drinking and Smoking age in 
		 * the United States.
		 * */


	}	

	public void printAge() {
		System.out.println("Testing age print");
	}

	public  void CheckAge() {
		try{
			Scanner in = new Scanner(System.in);

			System.out.println("Enter Your age?");

			int age = in.nextInt();  														//(Enter the age here you want to check.)


			if(age >= 21) {                            											// This is the legal age of Drinking in the US.
				
				System.out.println("This is a legal age for Drinking and Smoking.");
			}

			else if  (age >= 18 && age < 21) {    												// This is the legal age of Smoking in the US.
				System.out.println("This is a legal age for Smoking.");
			}
			else {
				System.out.println("This is not a legal age for Drinking nor Smoking.");
			}

		}
		catch(Exception e){							
			System.out.println("Please input valid age.");	// System will print this message when user input invalid age.
			e.printStackTrace();							// this method will print Exception details.

		}							
		CheckAge();
	}

}




