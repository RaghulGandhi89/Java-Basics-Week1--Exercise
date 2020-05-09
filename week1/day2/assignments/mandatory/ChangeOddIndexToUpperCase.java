package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args)
	
	{
		 // Declare String Input as Follow
		String test = "changeme";
		// a) Convert the String to character array
		char[] cUpper=test.toCharArray();
		// b) Traverse through each character (using loop)
		for(int i=0;i<cUpper.length;i++)
		{
			// c)find the odd index within the loop (use mod operator)
			// d)within the loop, change the character to uppercase, if the index is odd else don't change
			if(i%2!=0)
			{
				cUpper[i]=Character.toUpperCase(cUpper[i]);
			}
						
		}
			
		System.out.println(cUpper);		
	}	
}