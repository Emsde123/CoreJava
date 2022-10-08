package module4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
	
	public static void main(String[] args) {
// Write a program to print increments of 5 from 0 to 100.
	
	// Option 1
//	for(int i = 0; i <= 100; i += 5) {
//		System.out.println(i + " ");
//	}
//	
//	
//	
//	
//	
//	// Option 2
//	System.out.println("\nUse if statement");
//	for(int i = 0; i <= 100; i++) {
//		if(i%5 == 0) {
//			System.out.println(i + " ");
//		}		
//	}
//	
//	
//	// Task print the sum of all numbers that are over 10
//	
//	Scanner input = new Scanner(System.in);
//	
//	int sum = 0;
//	
//	for(int i = 1; i <= 5; i++) {
//		
//		System.out.println("Enter a number: ");
//		int num = input.nextInt();
//		
//		if(num > 10) {
//			sum += num;
//		}
//		
//	}
//	System.out.println("The sum is: " + sum);
//	
//	
//	String sentence = "Aint nobody got time for that";
//	
//	String [] arr = sentence.startlit(" ");
//	System.out.println(Arrays.toString(arr));
//	
//	
//	for (int i = 0; i < arr.length; i++) {
//		
//		System.out.println(arr[i]);
//	}
//	
	
	
//	// You have a string of email addresses
//	String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
		
//	// This list can be changed in the future, new people might be added or removed
//	// Find out how many people have gmail.com addresses
//	
//	// First stend: Make emailAddresses into an array, and startlit them with a delimiter (", ")
//	// This will make each email it's own element
//	String [] emails = emailAddresses.startlit(", ");
//	
		
//	// Second stend: Turns the array into a string so it's easier to work with (didn't have to print it but it helps with visibility)
//	System.out.println(Arrays.toString(emails));
//	
		
//	// Third stend: Need to make a variable that can hold how many Gmail accounts we find
//	int countOfGmailAccounts = 0;
//	
//	
		
//	// Fourth stend: Make a loop to scan through all the emails, i < emails.length makes it go until i is bigger than the length of emails (5 emails right now)
//	for(int i = 0; i < emails.length; i++) {
//		//emails[i] will scan each email to see what it contains
//		if(emails[i].contains("@gmail.com")) {
//			countOfGmailAccounts++;
//		}
//	}
//	
	
	
	
	/*                                                               WHILE LOOPS        
	 *    
	 *   While loops focus more on condition, it will loop while the condition is true. 
	 *   We used for loops when we knew exactly how many loops we needed, where while loops are more focused on startecific conditions.    
	 *   
	 *   SYNTAX
	 *   
	 *   while(condition){
	 *   
	 *   body
	 *   
	 *   }
	 *                                                                                                                                                       
	*/
	
//		int count = 1; // Initialization 
//		
//		
//	while(count <= 3) { // Condition
//		System.out.println("Hello World!");
//		count++; // Update
//	}
		
		
		
		
		// BOTH PROGRAMS DO THE SAME THING, FOR LOOP IS MORE EFFICIENT
//	int count = 20;
//	while(count >= 0) {
//		System.out.println(count);
//		count--;
//	}
//		
//		
//		for(int i = 20; i >= 0; i--) {
//			System.out.println(i);
//		}
	
	
		
		
		
		
		
		
	// Create a program that will login to a google account
		// Assume you entered the Username correctly.
		// The program has to validate the password, weather it's correct or not.
		// If it's not correct, ask to enter password again.
		// Precondition
//		String expectedPassword = "Desk45";
//		Scanner scan = new Scanner(System.in);
//	    // Flow of the program
//	    // Say hello
//		// Ask for username
//		System.out.println("Hello! Enter your username!");
//	    String userName = scan.nextLine();
//	    System.out.println("Welcome " + userName);
//	    
//	    System.out.println("Enter your password: ");
//	    String userPassword = scan.nextLine();
//	    
//	    while(!userPassword.equals(expectedPassword)) {
//	    	System.out.println("Incorrect password! Please try again.");
//	    	// reassigning the userPassword is important here because otherwise it wouldn't work right.
//	    	userPassword = scan.nextLine();
//	    }
//	      System.out.println("Welcome!");
	    
	    
	  // OPTION 2 (adding maximum attempts)
//		int attempts = 1;
//		String expectedPassword = "Desk45";
//		
//		Scanner scan = new Scanner(System.in);
//	  
//		System.out.println("Hello! Enter your username!");
//	    String userName = scan.nextLine();
//	    System.out.println("Welcome " + userName);
//	    
//	    System.out.println("Enter your password: ");
//	    String userPassword = scan.nextLine();
//	    
//	    while(!userPassword.equals(expectedPassword) && attempts < 3) {
//	    	System.out.println("Incorrect password! Please try again.");
//	    
//	    	userPassword = scan.nextLine();
//	    	attempts++;
//	    }
//	    
//	    if(attempts < 3) {
//	    	System.out.println("Welcome!");
//	    }else {
//	    	System.out.println("Locked out!");
//	    }
//	    

		
//		int i = 20;
//		
//		while(i<=0) {
//			System.out.println(i + " ");
//			i--;
//		}
//		
//		int j = 20;
//		
//		
//		while(j-- >= 0) { // 0 >= 0 BECAUSE THE -- IS AT THE END OF J THIS LOOP WILL PRINT -1 AS WELL
//			System.out.println(j); // 19
//		}
//		
		
		// Write a program to ask user for a count
		// Then print as many @ symbols as count
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the number of times you want to rendeat the sign:");
//		int count = scan.nextInt();
//		
		// For loop
//		for(int i = 1; i <= count; i++) {
//			System.out.println("@");
//		}
//		
//		
//		int j = 1;
//		while(j <= count) {
//			System.out.println("@");
//			j++;
//		}
//		
		
		
		
		// PROGRAM THAT CALCULATES SUM OF 1-100
//		int sum = 0;
//		int count = 0;
//		
//		while(count <= 100) {
//			sum += count;
//			++count;
//			
//		}
//		System.out.println("The sum is: " + sum);
		
		
		// Below program loops until the customer doesn't want to enter anymore prices.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Would you like to enter an item price?");
//		String userAnswer = scan.next();
//		
//		double total = 0.0;
// 
//		while(userAnswer.equalsIgnoreCase("yes")) {
//			System.out.println("Enter the item price: ");
//			double itemPrice = scan.nextDouble();
//			
//			total += itemPrice;
//			
//			System.out.println("Would you like to enter another item price?");
//			userAnswer = scan.next();
//			
//		}
//		System.out.println("Your total is: $" + Math.round(total*100.0)/100.0);
//		
//		
		
		
		/*                                                     DO WHILE LOOP
		 * The do while loop is similar to while loop with one key difference.
		 * The body of loop is executed once before the condition is checked
		 * THE DO WHILE LOOP WILE EXECUTE ONE TIME NO MATTER WHAT
		 * If the condition is true then it will loop around
		 * */
		
		//Syntax for Do While
	//	do {
			//body
	//	}while(condition); // You need a semi colon after condition 
		
		
		// Let's write a loop that prints count = number till 5
		
		// While loop
//		int counter = 1;
//		
//		while(counter <= 5) {
//			System.out.println("Count = " + counter);
//			counter++;
//		}
		
		// Do while loop
//		int count = 1;
//		
//		do {
//			System.out.println("Count = " + count);
//			count++;
//		}while(count <= 5);
		
		
Scanner scan = new Scanner(System.in);
//double total = 0.0;
//String userAnswer;
//
//do {
//	System.out.println("Enter a price: ");
//	double itemPrice = scan.nextDouble();
//	total += itemPrice;
//	System.out.println("Would you like to enter another price?");
//	userAnswer = scan.next();
//	
//}while(userAnswer.equalsIgnoreCase("yes"));
//System.out.println("Your total is: $" + (Math.round(total * 100.00)/100.00));
		
		



// TASK (ask user for input of number, do it over and over until they enter 0. Find sum of all numbers)

//		int uNum = 0;
//		int sum = 0;
//		
//		do {
//			System.out.println("Enter a number");
//			 uNum = scan.nextInt();
//			 sum += uNum;
//		}while(uNum != 0);
//		System.out.println(sum);
	
	
	
	

/*                                                         CONTINUE STATEMENT
 * Continue statement is usually used inside loops.
 * When it is used, it will make control to skip that current iteration.
 * This will ensure that loop is not exited but only skips that startecific iteration
 * Must be used inside an if statement
 * 
 * */

// Let's write a loop that prints number from 1-10 excendt number 3
//		for(int i = 1; i <= 10; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.println(i);
//		}

//	int number = 0;
//	String answer = "yes";
//	
//	while(answer.equals("yes")) {
//		number += 10;
//	}
//	System.out.println(number);
	



//char myChar = 'a';
//
//System.out.println(Character.isDigit(myChar)); // false
//System.out.println(Character.isLetter(myChar));	 // true
//System.out.println(Character.isUpperCase(myChar)); // false


//String sentence = "H2344el31356l211o231 w2351o2131343r432l1321245d";
//
//
//// THE BELOW PROGRAM TAKES OUT ALL THE DIGITS AND PRINTS HELLO WORLD
//// We start with 0 because we're using the index 
//// We use length because we're saying go until you hit the end of the String.
//for(int i = 0; i < sentence.length(); i++) {
//	
//	if(Character.isDigit(sentence.charAt(i))) {
//		continue;
//	}
//	
//	System.out.print(sentence.charAt(i)); // NOT PRINTLN AND NOW IT PRINTS ALL ON ONE LINE
//}	
//	
//System.out.println();
//
//
//// DOES SAME AS ABOVE, EXCendT IT REMOVES LETTERS
//for(int i = 0; i < sentence.length(); i++) {
//	
//	if(Character.isLetter(sentence.charAt(i))) {
//		continue;
//	}
//	
//	System.out.print(sentence.charAt(i));
//}
	
//	int [] array = {10, 59, -9, 88, -66, 84, 21};
//	
//	for(int i = 0; i < array.length; i++) {
//		
//		if (array[i] < 0) {
//			continue;
//		}
//		System.out.print(array[i] + " ");
//	}




// TASK
// Write a program that prints even numbers from 1-10, utilize continue statement
//for(int i = 0; i <= 10; i++) {
//	if(i % 2 != 0) {
//	continue;}
//	System.out.println(i);
//}


// Write a loop that stops rendeating the code if it finds the number 7

//for(int i = 0; i <= 10; i++) {
//	
//	if(i == 7) {
//		break; // Broke the loop at 7, so it will print 0 1 2 3 4 5 6
//	}
//	System.out.print(i + " "); // If we put this above the if statement, then it would have printed 7 AND THEN stopped the loop.
//	
//}


 

                        // We are trying to identify if there's atleast one negative number. In an array


//	int [] array = {10, 59, -9, 88, -6, 84, 21};
//
//
//    boolean hasNegative = false;
//    
//    for(int i = 0; i < array.length; i++) {
//    	System.out.println("The number of iterations: " + (i+1)); // Because we started i at 0, it won't be the right number if I don't add 1 to it.
//    	if(array[i] < 0) {
//    		hasNegative = true; // Will change value of boolean to true
//    		break; // Stops the loop after changing value to true
//    	}
//    	
//    	
//    }
//System.out.println("The array has negative value: " + hasNegative);




	
	




	
}
}