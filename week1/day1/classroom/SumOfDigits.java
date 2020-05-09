package week1.day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)
		int number = 123;
		// Initialize an integer variable by name: sum
		int sum = 0;

		// Use loop to calculate the sum: which loop to use until the number goes greater than 0??
		while (number > 0)
		{		
		// Within loop: get the remainder when done by 10 -> Tip: use mod
			
			int rem = number % 10;
			// Print the remainder to confirm
			System.out.println("Reminder" + rem);
			// Within loop: add that remainder to the sum
			sum = sum + rem;
			// Print the sum to confirm
			System.out.println("Sum" + sum);
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)		
			number = number / 10;
			// Print the quotient to confirm
			System.out.println("number" + number);			
		}
		System.out.println("Totalsum" + sum);					
		// Outside the loop: print the final sum
	}

}