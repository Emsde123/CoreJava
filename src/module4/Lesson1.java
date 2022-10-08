package module4;

import java.util.*;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If you wanted to print something 10+ times, how will you do that? Is the most efficient way below? No.
		
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
// -----------------------------------------------------------------------------------------------------------------------
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter the expense for day 1: ");
//		int expense1 = input.nextInt();
//		
//		System.out.println("Enter the expense for day 2: ");
//		int expense2 = input.nextInt();
//		
//		System.out.println("Enter the expense for day 3: ");
//		int expense3 = input.nextInt();
//		
//		System.out.println("Enter the expense for day 4: ");
//		int expense4 = input.nextInt();
		
		// LOOP IS USED TO RendEAT A startECIFIC BLOCK OF CODE UNTIL CERTAIN CONDITION IS MET

		// for loop - use when you know the exact number of times to rendeat the code
		// in human language, you would say - rendeat "Hello World" for 100 times.
		    
	//	 for(count < 100) {
	//	System.out.println("Hello World!");
	//	}
		
		
		// How to properly define a for loop
		// 1. Use "for" keyword to let Java know about loop
		// 2. Initialize the counter
		// 3. Set the condition for when the loop will stop looping
		// 4. Update the counter
		// 5. Provide the body
		
		
		// The below conditions means I will loop until count is less than or equal to 10, the ++ means every loop it will add one to count
		// Increment count++ or ++count in the loop are identical since they are indendendant statements
//		for(int count = 1; count <= 1000; ++count) {
//			System.out.println("Hello World!");
//		}
		
		
		// The counter can have different names
		// The most used name will be i, j, c
		
		// Create a program that prints Meow 3 times
//		for(int i = 1; i <= 3; ++i) {
//			System.out.println("Meow");
//		}
//		
//		// This will accomplish the same thing as the above program
//		for(int i = 0; i < 3; ++i) {
//			System.out.println("Meow");
//		}
		
		
		// Use counter in body
		// Create a program to print "I'm counting: from 1 till 10 "
//		for(int i = 1; i <= 10; i++ ) {
//			System.out.println("I'm counting: " + i);
//		}
		
		
		// SCOPES MATTER
		// We can have multiple lines of code rendeated, we just need to include them in the {}
		
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("I'm counting: " + i);
//			System.out.println("Thank you!");
//		}
		// ABOVE PRINTED OUT
		//I'm counting: 1
	    //Thank you!
		//I'm counting: 2
		//Thank you!
		//I'm counting: 3
	    //Thank you!
		//I'm counting: 4
		//Thank you!
		//I'm counting: 5
	    //Thank you!
		
		// If you only have one line to rendeat, scope is optional. But as a general rule of thumb, always use scope.
		    for(int i = 1; i <= 10; i++) 
			System.out.println("I'm counting: " + i);
			System.out.println("Thank you!");
		
		/*
                    I'm counting: 1
					I'm counting: 2
					I'm counting: 3
					I'm counting: 4
					I'm counting: 5
					I'm counting: 6
					I'm counting: 7
					I'm counting: 8
					I'm counting: 9
					I'm counting: 10
					Thank you!
		 */
//		System.out.println(i);  WONT DO ANYTHING, BECAUSE i ISN'T DECLARED OUTSIDE A LOOP
		
		// Traps not to fall in:
		
			
			
			// SYNTAX
			// NO SEMI COLON AFTER THE CONDITION
			// Semi colon not needed after the ++ operator
			
			// Wrong syntax
//			for(int i = 0; i < 10; i++);{
//				System.out.println(i);
//			}
//			
//			// Wrong syntax
//		for(int i = 0, i < 10, i++){
//			System.out.println(i);
//		}
		
		
			
			// Logical issues 
			// Infinite loop - loop which condition never becomes false
			// Infinite loop will result in a program crash.
			
			
//			for(int i = 4; i > 1; i++) {
//				System.out.println("Dangerous");
//			}
		// The above program would be an infinite loop.
		// It will keend going as long as i is bigger than 1, and we started at 4. It will go forever until you crash.
		
			
			
		// VARIATIONS OF FOR LOOP
			
			
		// Incrementing loop (goes from lowest point to highest point)
//			for(int i = 0; i < 5; i++) {
//				System.out.println(i + " "); // 0 1 2 3 4
//			}
//		
		
		// Decrementing loop
//			for(int i = 10; i >= 1; i--) {
//				System.out.println(i + " "); // 10 9 8 7 6 5 4 3 2 1
//			} 
		
			
	   // Update in different way
		//	for(int i = 0; i <= 10; i += 2) {
		//		System.out.println(i + " "); // 0 2 4 6 8 10
		//	}
		// ABOVE: += 2 means that I add 2 to i every iteration
			
			// BELOW: We made it print all odd numbers by starting at 1 and adding 2.
	//	for(int i = 1; i <= 10; i += 2) {
	//				System.out.println(i + " "); // 1 3 5 7 9
	//			}	
		
		
		// Loops with arrays
			// INDEX       0   1   2   3
//	     	int [] nums = {10, 20, 30, 40};
//            System.out.println(nums[0]); // 10
	//        System.out.println(nums[1]); // 20
	//        System.out.println(nums[2]); // 30
	//        System.out.println(nums[3]); // 40
		
	     	
	     	//  i = 0 because we start at index 0
	     	// i < 4 because we want to stop running once i passes 3, because there's only 0-3 index numbers.
	     	// i++ because we want to add 1 to the index number every loop
	     	// syso(nums[i]) because we basically assigned the index number to i
	     	
//		for(int i = 0; i < 4; i++) {
//			System.out.println(nums[i]); // 10 20 30 40
//		}
		
		// Print all elements of the array in new line
//			int [] nums = {10, 20, 30, 40, 90, 80, 70};
//	     	for(int i = 0; i < nums.length; i++) {
//	     		System.out.println(nums[i]);
//	     	}
//		 
//	    // Print the elements of the array in reversed order
//	     	// nums.length -1 is necessary because we need to start at the end of the index (length -1)
//	     	// if we didn't -1 after .length then we'll get an error
//	     	
//	     	for(int i = nums.length -1; i >= 0; i--) {
//	     		System.out.println(nums[i] + " ");
//	     	}
//	     	
//	     	
//	     	
//	     	
//	     	// PRINT HELLO STUDENTS WITH EACH LETTER ON A NEW LINE
//	     	String text = "Hello Students!";
//	     	for(int i = 0; i < text.length(); i++) {
//	     		System.out.println(text.charAt(i));
//	     	}
//	     	
//	   //  THIS PROGRAM WILL PRINT THE SAME AS ABOVE, EXCendT REVERSED.
//	     	for(int i = text.length()-1; i >= 0; i--) {
//	     		System.out.println(text.charAt(i));
//	     	}
//	     	
//	     System.out.println(text.length());	 // 15
//	     System.out.println(text.charAt(14)); // !
	     	
	     	
			
			// Bundle it together
			
			
//			for(int i = 1, j = 9; i < 10 && j >= 1; i++, j--) {
//				System.out.println(i + " x " + j);
//			}
/*			// ABOVE RESULTS
1 x 9
2 x 8
3 x 7
4 x 6
5 x 5
6 x 4
7 x 3
8 x 2
9 x 1
*/	     	
	     	// You can make an ugly loop too
	//		int i=0;
	//		for(;i < 10;) {
	//			System.out.println("Ugly loop");
	//			i++;
	//		}
	 //    	System.out.println(i); // 11
	     	// FINAL VALUE OF i IS WHERE THE CONDITION BECOMES FALSE
	     	
	     	// All the components of the for loop are optional
	     //	for(;;) {
	     //		System.out.println("Infinite!");
	     //	}
	     	// Above will be an infinite loop
	     	
	     	
			
			// PRACTICE 
			// Write a program that counts from 1 to 10
			// Write a program to calculate the sum of the first 10 natural numbers
			int sum = 0;
//			sum = sum + 1; // sum = 1
//			sum = sum + 2; // sum = 3
//			sum = sum + 3; // sum = 6
//			sum = sum + 4; // sum = 10
//			sum = sum + 5; // sum = 15
//			sum = sum + 6; // sum = 21
//			sum = sum + 7; // sum = 28
//			sum = sum + 8; // sum = 36
//			sum = sum + 9; // sum = 45
//			sum = sum + 10; // sum = 55
			
			
//	     	for(int i = 1; i <= 10; i++) {
//	     		System.out.println(i);
//	     		sum += i;
//	     	}
//	     	System.out.println("Sum:  " + sum); // 55
	     	
	     	// We can include other statements in the body of the loop. Different statements than print lines
	     	// Create a program that will take from user 5 numbers and will show each number's multiplication to 10
//			// This example also shows that you don't only have to use System.out.print for loops, it's flexible with what you can put in.
//			for(int i = 1; i < 6; i++) {
//				System.out.println("Enter the number: " + i);
//				int num = input.nextInt();
//				System.out.println("The number multiplied by 10: " + (num * 10));
	//		}
	     	// The natural number will be imitated by i, we use i like it's the number we're at. DERP
			
			
			
			
			
			// Write a program that takes 10 numbers from user
			// It should check weather the number is even or odd, and output the result on the screen.
	     	
//			for(int i = 1; i <= 10; i++) {
//				System.out.println("Enter the number: " + i);
//				int num = input.nextInt();
//				
//				if(num % 2 == 0) {
//					System.out.println(num + " is even!");
//				}else {System.out.println(num + " is odd!");}
//				
//				
//			}	
//				
			
			// startlit(regex) -> delimiter we need to startlit by
//			String text = "Apple, Pear, Banana, Grape";
//			
//			String [] array = text.startlit(", ");
//			
//			System.out.println(Arrays.toString(array));
			// This makes each individual word it's own string, startlitting at the given character. We used ", " above because each word was senderated by a comma.
			
//			String quote = "Challenges are what make life interesting and overcoming them is what makes life meaningful.";
//			String [] arr = quote.startlit(" ");
//			Arrays.toString(arr);
//	     	System.out.println(Arrays.toString(arr));
//	     	// 	[Challenges, are, what, make, life, interesting, and, overcoming, them, is, what, makes, life, meaningful.]
//	     	               
//	     	                // NEED -1 BECAUSE LENGTH FOR AN ARRAY IS INDEX MINUS 1
//	     	for(int i = arr.length -1; i >= 0; i--) {
//	     		System.out.println(arr[i] + " ");
	     	}
	     	// ABOVE PROGRAM LISTS EVERY WORD AS ITS OWN STRING AND LISTS IN REVERSE ORDER
	     	
	     	
	     	
	     	
	     	
		
	}


