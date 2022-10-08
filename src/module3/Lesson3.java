
		package module3;

		import java.util.Random;
		import java.util.Scanner;

		public class Lesson3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
			 /* SWITCH CASE STATEMENT
		* 1. Value which we use to check against other cases.
		* 2. If value matches value2, the second case executes.
		* 3. If value matches value3, the third case executes.
		* 4. And if argument doesn't match any of the values the default will be executed.
		* Basically the Switch(value) holds a value that is then compared to all the other cases below it.
		* There is a default case at the bottom of the list, if none of the values match then the default value will execute.
		* Similar to if else statement.
		* the difference between the two is with Switch case you can't put a condition that checks for a range. You can only check equality. 
		* It's either equal or it's not.
		*/ 
			
		//int myNum = 4;
		//
		//if(myNum == 1) {
//			System.out.println("Value was 1");
		//}else if(myNum == 2) {
//			System.out.println("Value was 2");
		//}else if(myNum == 3) {
//			System.out.println("Value was 3");
		//}else if(myNum == 4) {
//			System.out.println("Value was 4");
		//}

			//                                            MORE READABLE WAY TO MAKE THE PROGRAM ABOVE WITH SWITCH
				
				
				// When you create your cases, we'll need to introduce break statement. If you don't use break, it will run all cases.
				
//				int mySwitchValue = -1;
//				switch (mySwitchValue) {
//				
//				case 1 : 
//				System.out.println("Value was 1");
//				break;
//				case 2 :
//					System.out.println("Value was 2");
//					break;
//				case 3 : 
//					System.out.println("Value was 3");
//				break;
//				
//				default: 
//				System.out.println("Default statement gets executed because none of the cases matched.");
//				
//				}
//				
				Scanner input = new Scanner(System.in);
				// Welcome message
//				System.out.println("Welcome to the Best Coffee Shop.");
//				System.out.println("Here is our menu.");
//				System.out.println("_____________________");
//				System.out.println("1. Americano");
//				System.out.println("2. Estartresso");
//				System.out.println("3. Latte");
//				System.out.println("4. Cappuccino");
//				System.out.println("5. Hot Tea");
//				
//				System.out.println("Please enter the number of the item you'd like to get.");
//				int cSelection = input.nextInt();
//				switch (cSelection) {
//				
//				case 1:
//					System.out.println("One Americano, coming right up!");
//				break;
//				case 2:
//					System.out.println("One Estartresso, coming right up!");
//				break;
//				case 3: 
				
//		            System.out.println("What type of milk would you like?");		
//				String milkType = input.next();
//				if(milkType.equals("whole")) {
//					System.out.println("Your latte with whole milk is coming right up!");
//				}else{
//				System.out.println("Sorry, we don't have that type of milk.");
//			}
//					System.out.println("One Latte with whole milk, coming right up!");
//					break;
//				case 4:
//					System.out.println("One Cappuccino, coming right up!");
//					break;
//				case 5: 
//					System.out.println("One hot tea, coming right up!");
//					break;
//					default: 
//						System.out.println("Hmmm, I don't think we have anything that matches that number.");
//				}
//				
//				System.out.println("Thank you for visiting us!");
//				
				/* NOTES FOR SWITCH CASE STATEMENTS
				 * You can have multiple cases in one switch block
				 * You can not have duplicated values for the case
				 * The values in cases have to match the data type of the expression
				 * (if the switch() contains a String then you can't use 1, 2, 3 for the cases. It has to be ABC's)
				 * the values of cases have to be constants, you can not use variables.
				 * Each case block has to contain break statement in order to avoid executing multiple cases.
				 * The default statement is optional, it will be executed if none of the cases match the expression.
				 * In Java for switch statements we can use these data types: byte, short, int, char, String - Enums
				 * 
				 * */
//				
//				System.out.println("Please enter the correstartonding number of the month you're talking about (eg. 1 for Jan, 2 for Feb.)");
//				int whatMonth = input.nextInt();
//				switch(whatMonth) {
//				case 1:
//					System.out.println("January");
//					break;
//				case 2: 
//					System.out.println("Feburary");
//					break;
//				case 3: 
//					System.out.println("March");
//					break;
//				case 4: 
//					System.out.println("April");
//					break;
//				case 5: 
//					System.out.println("May");
//					break;
//				case 6:
//					System.out.println("June");
//					break;
//					default:
//						System.out.println("Invalid month");}
//						
//						System.out.println("Thanks for using month converter!");
				
				/*     IF VS SWITCH
				 * - 95% of the time you'll use if statements 
				 * - Switch will be used when we have to compare a value against a list of values.
				 */
				
				
				/*SCOPE
				 * If you declare a variable inside of a block, you can only use it inside that block.
				 * You can declare the variable outside the block, and then use it inside the block if you'd like.
				 * if you use a variable that was declared outside the block, and give it a new value where the if statement executed
				 * then it will reassign the value even outside the block.
				 * */
				
				
//				int methodLevelVariable = 700;
				
//				if(10 > 5) {
//				System.out.println(methodLevelVariable);
//				int ifLevelVariable = 100; // WILL ONLY WORK INSIDE THE BOX/SCOPE
//				if (10 > 5) {
//					System.out.println(ifLevelVariable); // WILL WORK
//				}
			//	else if(ifLevelVariable) // WILL NOT WORK
				
//				}
			//	System.out.println(ifLevelVariable); // WILL NOT WORK
//				
//				System.out.println("Please enter a value for x");
//				int x = input.nextInt();
//				System.out.println("Now a value for y");
//				int y = input.nextInt();
//				
//				 
//				
//				if(x > y) {
//					System.out.println("x is bigger than y " + (x - y) + " is the difference");
//				}else if(x < y) {
//					System.out.println("x is smaller than y " + (y - x) + " is the difference");
//				}else System.out.println("x and y are the same");
//		       
//				
//				
				
				// 
				// 
				// IN RANDOM CLASS THE FIRST NUMBER IS INCLUDED AND THE LAST NUMBER IS LEFT OUT
//		 		RANDOM class gives us the ability to generate different random numbers.
		//Random random = new Random();
				// Use the object from random class to access methods from it
		//int myRandom = random.nextInt(1, 6); // 6 WOULD NOT BE INCLUDED, IT'S 1-5
		//
		//System.out.println("Hey there, guess a number between 1 and 5 to see if you win!");
		//int cGuess = input.nextInt();
		//
		//if(cGuess == myRandom) {
//			System.out.println("Correct!");
		//}else {
//			System.out.println("Hard luck! Maybe next time.");
		//}

				        // Using literals to create strings. Directly stating the value of a String.
//			         	String str = "book";
//						String str2 = "book";
						
//						String str3 = "Book";
						// Creating Strings using new method
//						String str4 = new String("book");
//						String str5 = new String ("book");

						// Using literals Java will first check if the same value exists in the String pool. If there's already an object with the same value, Java will point the 
						// reference to that object and will not create a new one. If the object with the same value doesn't exist in the String pool, Java will create a new one.
						// Look at str, str2, and str3 above. str, and str2 will both point to the same object to reuse the value. str3 will point to a new object because it
						// isn't the same value.
						
						// Using the "new" keyword actually makes a new object no matter if there's already a duplicate value in the String pool.
				        // str == str2 -> true
						// str == str4 -> false
						// str.equals(str4) -> true (they have the same values)
						
						
						// The == checks if the two references point to the same object
						// equals.() compares the values of the two strings. 
				
		//  System.out.println(str == str2); // TRUE (same object)
//			System.out.println(str.equals(str2));	// TRUE (values are the same)
//		    System.out.println(str.equals(str3)); // FALSE (equals. method is case sensitive)
//			System.out.println(str4 == str5); // FALSE (different objects)
//			System.out.println(str4.equals(str5)); // TRUE (SAME VALUE)			
						
						
//				String x = "apple";
//				String y = "apple";
//				String z = new String("apple");
//				String w = new String("apple");
//				System.out.println(x==y); // true
//				System.out.println(w==z); // false 
//				System.out.println(w==x); // false 
				
						
						
						
						
				
				/*str.length()*/
				// Will return the count of characters in a given string
				// returns an integer
				
//				String name = "Omar";
//				System.out.println(name.length()); // 4 (WILL RETURN AN INTEGER (COUNT OF CHARACTERS))
				
//				String fullName = "Omar Ramo";
//				int lengthOfString = fullName.length();
//				System.out.println(lengthOfString); // 9
						
//						String dalton = "Dalton Allen";
//						String joshua = "Joshua Berry";
//		        		int lengthOfDalton = dalton.length(); -> int
//		        		int lengthOfJoshua = joshua.length(); -> int
//		        		System.out.println(lengthOfJoshua + lengthOfDalton);
				
				

						/*str.index()*/
						// str.length() is counted from the beginning letter.Example: "John" would return a length of 4
						// str.index() is counted from 0 on the beginning letter. Example: "John" would return 3.
						// THE LAST INDEX IS ALWAYS LENGTH -1
						
						
//						
//						
//						/*str.charAt(int index)*/ 
//						// str.charAt() returns a character in a startecific index
////						          length   12345678910
//						String myString = "Some Value";
//						//        index    0123456789
//					System.out.println("Character at index 0 is: " + myString.charAt(0)); // WILL PRINT "S" BECAUSE IT IS THE CHARACTER AT INDEX 0
//					System.out.println("Character at index 5 is: " + myString.charAt(5));
//				
//					int length = myString.length();
//					System.out.println("The last character in given String is: " + myString.charAt(length - 1)); // RETURNS "e" 
//		      //   If we provide an index to charAt which is out of bounds
//			  //   We will get an excendtion StringIndexOutOfBoundsExcendtion
//					
//					
//					
//					/*str.equals(String str2)*/
//					//Will check if both Strings are equal based on value
//					// Will return True or False.
//					
//					String name1 = "Jackie";
//					String name2 = "Jackie";
//					System.out.println(name1.equals(name2)); // TRUE
//					
//					String name3 = "Jackie";
//					String name4 = "jackie";
//					System.out.println(name3.equals(name4)); // FALSE
//					boolean result = name1.equals(name2);
//					System.out.println(result); // TRUE
//					
//					
				

//					
//					
//					/*str.equalsIgnoreCase(String str)*/
//					String newName = "Omar";
//					String newName1 = "oMaR";
//					System.out.println(newName.equalsIgnoreCase(newName1)); // TRUE (EVEN THOUGH CASE DOESNT MATCH)
//					
				
//					 // Yes yes YES
//					String userAnswer = "YEs";
//			System.out.println(userAnswer.equalsIgnoreCase("yes")); // TRUE (EVEN THOUGH CASE DOESNT MATCH)
					
//						System.out.println("please enter 2 words, one right after the other.");
//						
//						String str = input.nextLine();
//						String str2 = input.nextLine();
//						
//					  int strLength = str.length();
//					  int str2Length = str2.length();
//					  
//					  if(strLength > str2Length) {
//						  System.out.println(str + " is the longer word");
//					  }else if(strLength < str2Length) {
//						  System.out.println(str2 + " is the longer word");
//					  }else {
//						  System.out.println("The words are equal");
//					  }
//						
						
						//  endsWith(String suffix)
				// If the string ends with startecified String will return true or false
//					String newString = "working";
			//	   System.out.println("The word ends with ed: " + newString.endsWith("ed"));
				
//				
//				String savedWord = input.next();
//				if(savedWord.endsWith("ing")) {
//					System.out.println("Tense: Present Part...");
//				}else if (savedWord.endsWith("Ed")) {
//					System.out.println("Tense: Past");
//				}else {
//					System.out.println("The word has a different tense");
//				}
					
		         /*str.substring()*/
				// str.substring(start index)
				// will return us the substring in startecific range
				String str = "women";
				System.out.println(str.substring(2)); // PRINTS MEN
				
				System.out.println("unhappy".substring(2)); // PRINTS HAPPY
				System.out.println("smiles".substring(1)); // PRINTS MILES
				// str.substring(start index, end index)
				String sentence = "I will be an SDET in 5 months";
				System.out.println(sentence.substring(12, 16)); // 12 is included, 16 is excluded
				// First index will be inclusive
				// last index will be exclusive
				// provide one above for the index you want.
				
				String email = "email@gmail.com";
				
				System.out.println(email.substring(0, 5));
				
				
		
				
				
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
