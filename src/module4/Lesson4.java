package module4;

import java.util.Arrays;

public class Lesson4 {

	public static void main(String[] args) {
		

		// Practice
//		Print all the values of below array in using 
//		nested for loops
//		nested for each loop	// 4 length
		String apps[][] = 		{{ "Facebook", "Instagram", "Twitter", "Youtube" },  // i = 0
								// 4 length
		                        { "Bank of America", "TD Bank", "Chase", "Wells Fargo" },  // i = 1
		                        // 3 length
		                        { "Hotels", "AirBnb", "Expedia" }};  // i = 2
		       
		
												// BASIC FOR LOOP
		
		// In the outer loop, we just use the length of the array, but in the inner loop we need to get the length of each row
//		for (int i = 0; i < apps.length; i++) {
//			
//			// This will return the length of each row(i) 
//		for (int j = 0; j < apps[i].length; j++) {
//			// syso apps[i][j] means it will print the row at i and then the length at j. For the first iteration it will print Facebook
//			System.out.println(apps[i][j]);}}
//			
//		System.out.println("***********************");
//		                                        // ENHANCED FOR LOOP	
//		// Remember we need to define the data type for enhanced for loops. The array isn't just a String, it's a String[]
//		
//		// Each element in a 2D array is a one dimensional array
//		
//		// The outer loop will access each row, storing each row into the temporary variable eachAppArr for easy access
//			for(String[] eachAppArr : apps ) {
//				
//				// The inner loop gets a new string from every row, one by one
//				for(String eachApp : eachAppArr) {
//					System.out.println(eachApp);
//				}
//				
//			}
		
//		Write a program that takes arrays of integers and compares them
//		int[]tempArray= {23, 44, 12, 99, 4};
//		Then prints the smallest one out of them.

		
//		int[]tempArray= {23, 44, 12, -4, 99};
//		
//	// We'll need a temp variable that will store the value we think is the smallest one, to compare it against other values.	
//	// Is the value smaller than minValue? Store it into minValue. If not, then continue...	
//		int minValue = 0;
//		// Better way to do this would be to use 					minValue = tempArray[0]; instead of minValue = 0;
//		for(int i = 0; i < tempArray.length; i++) {
//			
//			
//			// We need to compare the value that we already have in minValue with the current element's value.
//			if(tempArray[i] < minValue) {
//				// Reassign the value if the condition becomes true
//				minValue = tempArray[i];
//			}
//			
//		}
//		System.out.println(minValue); // -4
//		
		
		
		
		  //                                                FOR EACH VERSION
	
		
//		int[]tempArray= {23, 44, 12, -4, 99};
//		
//		int min = tempArray[0];
//		
//		for(int num : tempArray ) {
//			
//			if(num < min) {
//				min = num;
//			}
//			
//		}
//		// int - each element's data type
//		// num - temp placeholder for each element's value
//		// : - is a syntax rule which will senderate the element from the array
//		// tempArray - the data structure we need to iterate through 
//		
//		
//		System.out.println("The minimum number in the array is: " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
