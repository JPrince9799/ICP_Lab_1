package icp.lab1;

import java.util.Scanner;

public class Question1 {

	public static void main (String[] args){
		//create a scanner for the program to get an input from the user
		System.out.println("Please enter the string here: ");
		Scanner phrase = new Scanner(System.in);
		//Inputed phrase assigned to a variable
		String input = phrase.nextLine();
		
		//statement to get the length of the inputed string
		int strLength = input.length();
		
		//This statement prints out the length of the string entered
		System.out.println("The entered string has " + strLength + " characters");
	}
}
