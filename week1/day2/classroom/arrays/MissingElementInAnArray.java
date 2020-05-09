package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,5,6,8};

		// Sort the array	
		Arrays.sort (arr);
		System.out.println(Arrays.toString(arr));
		int j;
		//	loop through the array (start i from arr[0] till the length of the array)

		for (int i = 0; i<arr.length; i++) 
		{
			j = i + 1;
			// check if the iterator variable is not equal to the array values respectively
			if (j != arr[i])
			{
				//  print the number
				System.out.println(j);
				// once printed break the iteration
				break;
			}
		}
	}
}
