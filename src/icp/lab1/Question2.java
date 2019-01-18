package icp.lab1;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.StringBuffer;

public class Question2 {

	// default constructor
	public Question2() {}

	public String rev() {
		// create scanner to get input from the user
		System.out.println("Please enter the string to get the reverse statement: ");
		Scanner data = new Scanner(System.in);
		//assign the inputed string
		String input = data.nextLine();
		
		//use the string builder to reverse the words as well as the characters within the words
		StringBuilder reversed = new StringBuilder();
		//Instantiate array to hold individual words
		String [] place = input.split(" ");
		// loop through the words and reverse them
		for (String word: place) {
			String sentence = new StringBuffer(word).reverse().toString();
			//place the reversed word in the array
			reversed.append(sentence + " ");
		}

		//return the final reversed statement to the user
		return "The reversed string is" + "\n" + reversed;
	}
	
	public static void main (String[]args) {
		//instantiate a variable to test the reverse
		Question2 test = new Question2();
		
		//call the reverse method to reverse the inputed statement from the keyboard
		System.out.println(test.rev());	
		
	}
}
