package week1.day2.classroom.string;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
				String str = "welcome to chennai";
				System.out.println("The given string is " +str);

				// declare and initialize a variable count to store the number of occurrences
				int occurrence = 0;
			    char check = 'w';
			    System.out.println("The character occurrence to check in the string is " +check);
				// convert the string into char array
				char[] ch = str.toCharArray();
				//get the length of the array
				for (char c : ch)
				{
					if (check == c)
					{
						occurrence = occurrence+1; 
						
					}
									
				}
				
				System.out.println("The number of occurence of the given character in the string is " +occurrence);
				// traverse from 0 till the array length 
				
					// Check the char array has the particular char in it 
					
					// if is has increment the count
						
					 
				
				// print the count out of the loop
					
	}

}