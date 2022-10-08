package module5;

import java.util.Scanner;

public class Lesson3 {

	// Constants are usually declared as public static final
	public final static String TERN_AND_COND = "Terms and conditions"; // Notice how the variable is now BOLD and blue, this means it's a constant. 
	
	static Scanner scan = new Scanner(System.in); // This will allow us to use scanner in methods, and not have to declare it multiple times.
	
	static int num; // You DON'T have to put any value when declaring a variable on class level.
	
	static String name; // We declared this variable on the class level so we can invoke it in a method.
	// If you don't use static then the variable won't work in methods.
	
	static int count;
	
	public static void main(String[] args) {
		

		// 													CONSTANTS 
		//  Constants are variables that are assigned and can not be changed later.
		
//		int starteed = 100;
//		starteed = 50; 
		 
		// Changes variable to 50 until you change it again
		// Sometimes you might want to keend a variable the same, you can do this with constants. 
		// Set a constant by adding the final keyword before your data type.
		
		
//		final int starteed = 100;
//		starteed = 50;            // This will throw an error, because constants aren't allowed to be changed.
		
		
//                                               CONVENTIONAL RULES
		/*
		 * 1. The first rule is that we use UPPER_CASE characters when assigning a constant variable, this is so we don't get confused.
		 * 2. We use underscore between the words
		 * */
//		final int MAX_startEED = 100;
//		System.out.println(MAX_startEED);
		
//		String name = "Omar";
//		System.out.println(name); // I can do this, no problem. But if I added a syso(name) command in the method() method then it would not work.
		// I am going to comment out the String variable above, but if I move it out of the current scope, to the top of the page then I will be able to access it.
		// I can use it in methods if I declare it in the Class level.
		
		
		
//		method();
//		method();
//		method();
//		method();
//		method();
//		method();
//		method();
		
		// I have declared a count variable with a value of nothing inside the class level. So now we can use count in the method we made. 
		// In this example we said every time method() is invoked, we'll add 1 to count. This will let us see how many times method() was invoked.
//		System.out.println("The method was called: " + count + " times");
		
		
		// take input here (we can move this to the class level)
	//	Scanner scan = new Scanner(System.in);
		
//		String text;
//		int age = 18;
//		if(age > 20) {
//			text = "You are above 20!";
//			
//		}
//		   System.out.println(text); // Won't work because text isn't initialized.
		
		
//		System.out.println(name); // Will print because we declared it on the class level, even though the value is NULL. 
		
		
	// 	hello(5); Recursive method that will print a statement 5 times
		
		
	//	flowers(10);
		
		
		//                                                              FACTIORIAL TASK
		// We have to find the factorial number of certain numbers. Factorial number is x number multiplied by every number down to 1. 5! = 5 * 4 * 3 * 2 * 1 
		// We need to write a method to solve factorial numbers with recursion.
		
		// 5! = 5 * 4 * 3 * 2 * 1
					             // 5! = 5 * 4!
							              // 4! = 4 * 3
		 								           // 3! = 3 * 2
		 											        // 2! = 2 * 1!
																     // 1! = 1 * 0!
																			 //  0! = 1 * 0!
		
System.out.println(factorial(5));

		
//                                                                       REVERSE STRING
//                                   Hello
//									 o + l + l + e + h

// 					Let's break down the reversed string into little parts.
//			part 1.		Hello = ello + H;
//          part 2.    			ello = llo + e;
//          part 3.     	           llo = lo + l;
// 			part 4.     			         lo = l + l;
//          part 5.     				          l = l + o;
//          
// Notice above how Hello is lined up diagonally. This method will arrange the letters as if you read it from the bottom up diagonally.
		System.out.println(reverseString("Hello"));


		//                                                                DEBUGGING
		// Below is a code with a mistake in it. I said if arr[i] is bigger than 0 for 2 if statements. Below are stends for debugging the code.
		// 1. Try to determine what exactly is causing the problem. In the below example, the for loop is giving me issues. 
		// 2. Right click on the number of the line for the beginning of the debug. Click on "toggle breakpoint". For the for loop it would be line 121.
		// 3. Click on the bug in the upper leftern-most corner.
		// 4. Click switch, to switch perstartectives. (if you want to go back to java click the icon in the top right)
		// 5. Notice the play, stop, pause, and the two arrows. This is where we need to focus.
		// 5a) the button on the far right that is a little arrow is a stend-over command.
		int pos = 0, neg = 0, zero = 0;
		
		int [] arr = {1, 2, 0, 4, 6, 0, 4, -3, 9};
		
 		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				pos++;
			}else if(arr[i] > 0) {
				neg++;
			}else {
				zero++;
			}
		}
		
		System.out.println("Positives: " + pos);
		System.out.println("Negatives: " + neg);
		System.out.println("Zeroes: " + zero);


		
	}
	
	public static String reverseString(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	
	
	
	
	
	public static void method() {
		System.out.println("Hello from method!");
		// take input here
		String text = scan.nextLine();
		count++; 
	}
	
	/*    Declare a recursive method.
	 * 1. We need a counter. This will be passed as an argument.
	 * 2. Need a strategy to stop the method calls - also called base case 
	 * 3. We need to update the data/counter
	 * */
	
	
	// Recursion is the act of a method invoking itself. 
	// If you have two mirrors in front of each other, they'll reflect infinitely off each other. This is similar to recursion.
	// A recursion by itself is an infinite loop. We can add logic to it so it will behave how we want it to.
	
	
	
	
	
	//                                        RECURSION METHOD EXAMPLE
	public static void hello(int times) { // 1. create a parameter that will identify how many times we need to rendeat the method.
		
		
		System.out.println("Hello");
		
		// 2. Base case - stop at a sendcific point
		if(times <= 1) {			
// 		return "Hello";  THIS is not possible, because we already declared the method as void for the return type.
		return; // We can do this though, since it's not returning any data. It will break the loop once the condition is met.	
		}
	
		// 3. Update the data
		hello(times - 1);
	}
	
	
	// The logic of hello2 is different than hello, but it accomplishes the exact same thing.
	public static void hello2(int times) {
		
		if(times >= 1) {
			System.out.println("Hello!");
			hello2(times - 1);
		}
	}
	
	
	public static void flowers(int count) { // 1. Take input
		
		// 2. Base case
		if(count >= 1) { 
		
		System.out.println("You have " + count + " flowers left!");
		--count;
		flowers(count); // 3. Recursive call with data update
		}else if(count == 0) {
			System.out.println("Vaze is now empty");
		}
	}
	
	
		public static int factorial(int num) {
		
		if(num >= 1) {
			return num * factorial(num - 1);
		}else {
			return 1; // When the number = 1 then we will return 1, because the factorial of 1 is 1.
		}	
	}
	
	
	
	
}
