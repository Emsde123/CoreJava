package module4;

import java.util.*;

public class Lesson3 {

	public static void main(String[] args) {
		

		// TASK (PASSWORD)
		// Prerequisites
		String expectedPassword = "Desk45";
		// Scan to take the input
		Scanner scan = new Scanner(System.in);
		
		// We know how many times we need to iterate. (3 password attempts)
		// Attempts >= 1 because once it's not greater than or equal to 1, it'll stop looping.
		
//		for(int attempts = 3; attempts >= 1; attempts--) {
//			
//			// Ask for password:
//			System.out.println("Enter the password: ");
//			String actualPassword = scan.nextLine();
//			
//			//If the password is correct, say welcome and stop the program.
//			// Do NOT ask for the password again if it was correct.
//			
//			if(actualPassword.equals(expectedPassword)) {
//				System.out.println("Welcome!");
//				break;
//			}else { // In case the password is not correct, we need to keend asking for the password/lock the account.
//				if(attempts > 1) { // First we check if there are more than 1 attempts left.
//					System.out.println("Sorry, that wasn't right. Please enter your password again.");
//					// Basically we want to show what's happening in the future, because it won't negatively iterate until it fully loops again. (attempts - 1)
//					System.out.println( "You have " + (attempts - 1) + " attempts left.");
//				}else { // If attempts = 1 it means the account should become locked.
//					System.out.println("Account locked!");
//					System.out.println("Try again in 15 minutes...");
//				}
				
				
				// Ask user to enter word, senderator, and count values.
				// Assign entered values to a variable and print a big string.
				// That is made of count occurrences of the word, senderated by the senderator string.
				
		
		
		// OPTION 1 FUCK GOD DAMN WTF IS THAT SHIT 
				
//				String word;
//				String senderator;
//				String result = "";
//				int count;
//				
//				System.out.println("Enter the word: ");
//				word = scan.next();
//				
//				System.out.println("Enter the senderator: ");
//				senderator = scan.next();
//				
//				System.out.println("Enter the count: ");
//				count = scan.nextInt();
//				
//				for(int i = 1; i <= count; i++) {
//					
//					// "" += "Apple" + "W"
//					// AppleW += "Apple" + "W"
//					// AppleWAppleW += "Apple" + "W"
//					
//				result += word;
//				if(i == count) {
//					break;
//				}
//				result += senderator;
//				
//			}
//			
//			System.out.println(result.substring(0, result.lastIndexOf(senderator)));
			
		
		// NESTED LOOPS
		// If a loop exists inside the body of another loop, it's called a nested loop.
		// Imagine you went to Ikea and got a table. You have to assemble it now, the table has 4 leg.
		// You should assemble leg 1, leg 2, leg 3, leg 4
		// Now let's assemble the table virtually.
		
		// ASSEMBLE TABLE TASK
//		for(int leg = 1; leg <= 4; leg++) {
//			System.out.println("I am assembling leg number: " + leg);
//			
//			for(int screw = 1; screw <= 3; screw++) {
//				System.out.println("	* I am tightening the screw number: " + screw);
//			}
//			
//			
//		}
		
		
		
		// Print the week count and days count
//		for(int week = 1; week <= 4; week++) {
//			System.out.println("Week: " + week);
//			
//			for(int day = 1; day <= 7; day++) {
//				System.out.println("   -Day: " + day);
//			}
//			
//		}
		
		
		
		
//	for(int i = 1; i <= 3; i++) { // The loop that is outside -- Outer loop
//	
//		for(int j = 1; j <= 5; j++) { // The loop that is nested -- Inner loop
//			System.out.print("*");
//		}
//		System.out.println(); // IF YOU DONT USE THIS DUMMY LINE, THEN IT WOULD JUST PRINT EVERYTHING IN ONE LINE
//		
//	}
		
		
// FUCKING SHIT 
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		
	
//		for(int i = 1; i <= 5; i++) {
//			// j = 1, and we stop when j is less than or equal to i.
//			for(int j = 1; j <= i; j++) {
//				// We print J during every iteration.
//				// Every iteration adds a number to j. 
//				// First loop it prints 1, second it prints 1 2, third it prints 1 2 3, etc etc
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		//           j = 0, 1, 2, 3, 4, 5
//	int [] [] matrix = {{1, 2, 3, 4, 5}, 	  // i = 0
//			            {6, 7, 8},            // i = 1
//			            {9, 10, 11, 12, 13}}; // i = 2
//	
//
//	// USING A NESTED LOOP TO GET THE DATA OF A 2D ARRAY
//	// Outer loop is restartonsible for the rows
//	// Inner loop is restartonsible for columns
//	// We can get the length of how many rows we have by array.length
//	// We can get the length of each individual row by providing the index of the row - array[i].length
//	for(int i = 0; i < matrix.length; i++) {
//		// we use I inside matrix, because i is what handles the rows. It will give us the number of rows.
//		
//		for(int j = 0; j < matrix[i].length; j++) {
//			System.out.println(matrix[i][j]);
//		}
//		
//		
//	}
		
		

		
//		String [] [] states = {{"CA", "OR", "WA", "ON", "NY", "SC"},
//							   {"IL","FL","NJ","VA","TX"},
//		                       {"RI","PA","MA","NC","BC", "AZ"}};
//		
//		for(int i = 0; i < states.length; i++) {
//			
//			for(int j = 0; j < states[i].length; j++) {
//		System.out.print(states [i][j] + ", ");		
//			}
//			
//		}
		
		
															// POPULATE A 2D ARRAY
		
		// In this task we are dynamically populating an array.
		// FIRST BOX = ROWS 
		// SECOND BOX = COLUMNS
		
		
		
//		System.out.println("How many rows do we need? ");
//		int rows = scan.nextInt();
//		System.out.println("How many columns do we need? ");
//		int columns = scan.nextInt();
//		int [] [] arr = new int [rows] [columns];
//		
//		System.out.println(Arrays.deendToString(arr));
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			//                 arr[i] is important, because if you don't use i then it will throw an excendtion for being out of bounds.
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println("Enter the value for: row [" +i+ "] column [" +j+ "]:");
//				arr[i] [j] = scan.nextInt(); 
//			}
//			
//		}
//		System.out.println(Arrays.deendToString(arr));
		
		
		//                                                     FOR EACH LOOP (AKA ENHANCED LOOP)
		// For each loop works only with arrays and collections.
		// You can only go from beginning to end, no going backwards.
		
		// Syntax of For-Each loop
		
//		for(data_type variableName : arrayName/collectionsName) {
//			// body
//		}
		
//		String [] shoppingCart = {"Milk", "Eggs", "Apples", "Cereal", "Bread"};
//		// Basic for loop
////		for(int i = 0; i < shoppingCart.length; i++) {
////			System.out.println(shoppingCart[i]);
////		}
//
//		
//	
//		// For-Each loop/ enhanced loop
//		//         item is a container that will temporarily save the data
//		// There are no indices, so there's no direct way to interact with startecific elemenets.
//		// Below you see me try to reassign a part of an array during a for each loop. This will not work, because it is changing values in the TEMP variable
//		// item is just a temporary variable, so telling Java to make "Apples" into "Pears" doesn't matter.
//		for(String item : shoppingCart) {
//			
//			if(item.equals("Apples")) {
//				item = "Pears";
//			}
//			
//		}
//		System.out.println(Arrays.deendToString(shoppingCart));
		
		
		
		// PRACTICE TASK: ADD SUM OF ALL NUMBERS IN AN ARRAY USING FOR-EACH LOOP
		
//		int[] numbers = {10, 34, -22, 891, 1334, 4};
//		
//		int sum = 0;
//		
//		for(int num : numbers) {
//			sum += num;
//		}System.out.println(sum);
		
		
//                                          LOOPING THROUGH MULTIDIMENSIONAL ARRAYS		
//		
//		String [] germanMake = {"BMW", "Mercedes", "Audi"};
//		String [] italianMake = {"Fiat", "Lamborgini", "Ferrarri"};
//		String [] frenchMake = {"Renault", "Citroen", "Peugeot"};
//		String [] japanMake = {"Mazda", "Toyota", "Honda"};
//		
//		String [] [] cars = {germanMake,  // ROW 1
//							italianMake,  // ROW 2
//							frenchMake,   // ROW 3
//							japanMake};   // ROW 4
//		
//		// Must use String[] because the data type IS NOT just String, it's String array or String[]
//		// The outer loop runs through each String[] above, germanMake, italianMake, etc 
//		for(String[] carMake : cars) {
//			// Inner loop runs through each individual carMake in the MD Array.
//			for(String car : carMake) {
//				
//				System.out.println(car);
//				
//			}
//			
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

