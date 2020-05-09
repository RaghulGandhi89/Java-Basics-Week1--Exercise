package week1.day2.assignments.mandatory;

import java.util.Arrays;

public class RemoveDuplicates {	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g)Displaying the String without duplicate words	
	 * h) print the each word
	 */
    public static void main(String[] args) 
    {
    	String text = "We learn java basics as part of java sessions in java week1";
  
    	int count =0;
    	String unique[]=text.split(" ");
    	for (int i = 0; i < unique.length; i++)
    	{
    		count = 0 ;
    		for (int j = i+1; j < unique.length; j++) 
    		{
    			//count =0;
    			if (unique[i].equalsIgnoreCase(unique[j])) 
    			{
    				count= count + 1;
    				unique[j]=unique[j].replace(unique[j], "");
    				
    			}
    		}
    	}
    	System.out.println(Arrays.toString(unique));
    	
        String result = "";
        for (String s : unique) 
        {
        	if (s != "") {
            result = result + s + " ";
            
        	}
        }
        System.out.println("The Duplicate removed output string is " + result);
        
    	/*for (int k = 0; k < unique.length; k++)
    	{
    		
    		
    	}*/
    }
}