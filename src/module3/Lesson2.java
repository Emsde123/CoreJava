package module3;

import java.util.Scanner;

public class Lesson2 {
public static void main(String[] args) {
// Create a program that will tell us if a number is even or odd
// The number is even or the number is odd
// The way to do this is to use the % operator. If there is 0 left over, then it is even. You'd print true.
	
   Scanner sc = new Scanner(System.in);
//   System.out.println("Please enter a number: ");
//   
//   int number = sc.nextInt();
//   
//   System.out.println("number%2: " + number%2);
//   
//   if(number%2==0) {
//	   System.out.println(number + " is even!");
//   }else {
//	   System.out.println(number + " is odd!");
//   }
//	System.out.println("Thanks!");

   
   
   //                                                   WRITING ELSE-IF STATEMENT (MULTIPLE IF CONDITIONS)
//   System.out.println("Enter your grade: ");
//	int score = sc.nextInt();
//	if(score <= 100 && score >= 90) {
//		System.out.println("Your grade is: A");
//		// notice how I didn't use less than or equal to for the score being less than 90. It would count for an A if I used <=
//	}else if(score < 90 && score >= 80 ) {
//		System.out.println("Your grade is: B");
//	}else if(score < 80 && score >= 70) {
//		System.out.println("Your grade is: C");
//	}else if(score < 70 && score >= 60) {
//		System.out.println("Your grade is: D");
//	}else if(score < 60 && score >= 0) {
//		System.out.println("Your grade is: F");
//	}else {
//		System.out.println("Sorry, your grade doesn't make sense.");
//	} // ELSE WILL ALWAYS BE LAST
	  // ELSE WILL NOT HAVE A CONDITION
	
//	System.out.println("Please enter your password: ");
//	int actualPassword = sc.nextInt();
//	
//	int expectedPass1 = 12345;
//	int expectedPass2 = 333;
//	int expectedPass3 = 444;
//	
	// OPTION 1
	
//	if(actualPassword == expectedPass1) {
//		System.out.println("Welcome Back!");
//		System.out.println("Your first password worked: " + actualPassword );
//		
//	}else if(actualPassword == expectedPass2) {
//		System.out.println("Welcome Back!");
//		System.out.println("Your second password worked: " + actualPassword );
//		
//	}else if(actualPassword == 	expectedPass3) {
//			System.out.println("Welcome Back!");
//		System.out.println("Your third password worked: " + actualPassword );
//		
//	}else {
//		System.out.println("Sorry, you can not log in.");
//	}
//	
	
	//                                EASIER WAY TO DO THE ABOVE PROGRAM
	//actualPassword == expectedPass1 || expectedPass2 || expectedPass3  <-- WILL NOT WORK. WILL TREAT EACH VARIABLE AS A NUMBER
	
	// OPTION 2
//	
//	if(actualPassword == expectedPass1 || actualPassword == expectedPass2 || actualPassword == expectedPass3) {
//		System.out.println("Welcome back!");
//		
//	}else {
//		System.out.println("Wrong password. ");
//	}
//	
	//                             TASK
//	int totalStock = 1000;
//	System.out.println("How many masks do you want to purchase? ");
//	int cMask = sc.nextInt();
//	double maskPrice = 2.50 * cMask;
//	double maskHundredDiscount = 2.25 * cMask;
//	double maskFiveHundredDiscount = 2.00 * cMask;
//	if (cMask > totalStock) {
//		System.out.println("Sorry, we don't have that many in stock.");
//		
//	}else if (cMask < 100 && cMask > 0) {
//		System.out.println("Sounds good, you will owe us $" + maskPrice);
//	
//	}else if (cMask > 100 && cMask < 500) {
//		System.out.println("Sounds good, you will owe us $" + maskHundredDiscount);
//	}
//	else if (cMask > 500 && cMask <= totalStock) {
//		System.out.println("Sounds good, you will owe us $" + maskFiveHundredDiscount);
//	}
//	else {
//		System.out.println("Sorry, that number is invalid.");
//	}
// 
   
//                                    STRING EQUALITY 
   
   // == - compares the value of two operands as primitive data types
   
   // There are two ways of creating a string
   // Using literals:
   String str = "book";
  
   // Using new keyword
   String str2 = new String("book");
  
   // Even though str2 and str both have the same value, they are not the same object.
   // for strings to compare two values we use str.equals(anotherString)
   //System.out.println(str == str2); // false
  // System.out.println("The values are the same: " + str.equals(str2)); // true
   
   
   
   //                                          TASK WHERE WE TAKE "YES" INPUT AS AN ANSWER
   
//   System.out.println("Hey there, how old are you?");
//   int age = sc.nextInt();
//   
//   System.out.println("Okay, and do you have a ticket? Answer yes or no please.");
//   String answer = sc.next();
//   
//   if((age >= 18 && answer.equals("yes")) || age >= 60) {
//	   System.out.println("Come on in!");
//   }
//   
//   else {
//	   System.out.println("Sorry, you can not enter.");
//   }
//
   
   
   
//   int age=20;
//   if(age >= 16) {
//	   System.out.println("You can drive");
//   }else {
//	   System.out.println("You aren't allowed to drive");
//   }
//  
//   
//   
//   
//   boolean mood = false;
//   if(mood) {
//	   System.out.println("Go to the gym!");
//   }else {
//	   System.out.println("Go to sleend!");
//   }

   
   
   //                             NESTED IF STATEMENTS
   // Basically means that you check for a condition, and if it is true ONLY THEN will you check the inside condition.
   // BOTH conditions MUST be true for the inner statements to execute.
   // Scopes are EXTREMELY IMPORTANT here
   
  
   // Google log in task
   
//   String expectedUser = "danielberry";
//   int expectedPass = 12345;
//   System.out.println("Enter your username: ");
//   String userName = sc.next();
//   int expectedSecretCode = 777;
//   
//   System.out.println("Enter your password: ");
//   int password = sc.nextInt();
//   
//   if(userName.equals(expectedUser) && password == expectedPass ) {
//	   // ask user to enter secret code, only when pass and user is met
//	   System.out.println("We sent you a secret code to your e-mail. Please enter it here: ");
//	   
//	   int secretCode = sc.nextInt();
//	   
//	   if(secretCode == expectedSecretCode) {
//		   System.out.println("You have successfully logged in!");
//	   }else System.out.println("Your secret code is invalid.");
//	   
//	   
//   }else {
//	   System.out.println("Invalid credentials.");
//   }
//   
   
   //                                 TASK
  
   
//   
//   System.out.println("Please enter the total cost of your items: ");
//   double totalCost = sc.nextDouble();
//   System.out.println("Do you have a membership? yes or no, please. ");
//   String answer = sc.next();

   
   
   
//   if(answer.equals("yes")){
//	   System.out.println("What kind of membership do you have? gold or silver?");
//	   String memberType = sc.next();
//	   double goldDiscount = (totalCost * 10 / 100);
//	   double goldTotal = totalCost - goldDiscount;
//	   if(memberType.equals("gold")) {
//		   System.out.println("Thank you for your membership, your discount is 10%, and your total comes out to: $" + goldTotal);
//	   }
//	   double silverDiscount = (totalCost * 5 / 100);
//	   double silverTotal = totalCost - silverDiscount;
//	   if(memberType.equals("silver")) {
//		   System.out.println("Thank you for being a silver member, your discount is 5%, and your total comes out to: $" + silverTotal);
//	   }
//			   
//   }else {
//	   System.out.println("Thank you, your total is: $" + totalCost);
//   }
   
//	discountedAmount = (price * discountPercentage / 100); <--- This will get you the amount that will be discounted
   // to get the total price it looks like this:
   //totalPrice = price - discountedAmount;
	
   
   
   
   
   
   
   
   
   
}
}
