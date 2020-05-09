package week1.day2.assignments.mandatory;

public class Palindrome {
	//Build a logic to find the given string is palinDrome or not
     
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) 
	{	
		//  a) Declare A String value as"madam"
		String Str = "madam";
		//String Str = "oppo";
		// b) Declare another String rev value as ""
		String rev = "";
		// c) Iterate over the String in reverse order
		for (int i =Str.length()-1; i>=0; i--)
		{
			rev=rev+Str.charAt(i);
		}
		if(Str.equals(rev))
		{
			System.out.println("The given string '" +Str + "' is a Palindrome");
		}
		else
		{
			System.out.println("The given string '" +Str + "' is not a Palindrome");
		}
		
	}
}