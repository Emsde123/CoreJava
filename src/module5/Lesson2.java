package module5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		
		
									// STRING METHODS RETURN EXAMPLES
		// We've already worked with some standard methods with return. Below are some examples:
//		char lettter = "Apple".charAt(2); // Will RETURN "p" because the charAt method has a return type, it's not void.
		
//		int number = "Apple".length(); // Will return "5" because the .length standard method ALSO returns, it's not void.
		
		
//		int sum = addNumsMK2(100, 33);
//		System.out.println(sum + 100);
		
		
//		String myString = sayHi(); COMPILATION ERROR because we aren't returning a string, we're just printing.
		
	//	addNums(10, 17); // prints 27
//		int result =   If you wanted to do a calculation with the 27 from the method above, you can't. 
//                     This is because it doesn't RETURN a value, it only prints the calculation.
		
		Scanner input = new Scanner(System.in);
		
		// Here we use our return method to generate an email address.
		
//		System.out.println("Enter your first name: ");
//		String fName = input.next();
//		System.out.println("Enter your last name, " + fName + ": ");
//		String lName = input.next();
//		
//		// We can assign the result of the method call to a variable
		
//		String email = generateEmail(fName, lName);
//		System.out.println("Your email will be: " + email);
//		
//		// We can also use the method call as an expression that will evaluate to a single value
//		// It's optional to make an extra variable to store the result of the method, below we inserted the method directly
//		// instead of storing the result in a variable and working with that.
		
//		System.out.println("Your email will be: " + generateEmail(fName, lName));
		
		
//		double result = calculateTax(100, 7);
//		System.out.println(result);
		
		
//	String text = "This is my text!";
//	String word = "Text";
////
////		System.out.println(text.contains(word)); // There is no method that will allow us to check if text contains word
//		//                                          while ignoring case. Let's make a method to do that!
//		
//	
//	System.out.println("The text contains the word: " + containsIgnoreCase(text, word));
		
//		int [] newArray = createArray(11, 99, -9);
//		System.out.println(Arrays.toString(newArray));		
		
//		System.out.println( resultSubtract(10, 24));
//     Option 1 using variables
	int result1  =	resultSubtract(10, 50);
	int result2 =	resultSubtract(20, 50);
	int result3 = result1 * result2;
		
	// Option 2 using just the method call
	int result4 = resultSubtract(10, 50) * resultSubtract(20, 50);
	
	// Option 1
	System.out.println(resultSubtract(result1, result2));	
	// Option 2
	System.out.println(resultSubtract(resultSubtract(100, 10), resultSubtract(10, 100)));
	
	
	}

	
	
	
	
	
	/*
	 * Create a method that will take three integers
	 * and return them as an array 
	 * */
	public static int[] countOfPositive(int a, int b, int c, int d, int e) {
		int[] arr = {a, b, c, d, e};
		return arr;
		
		
	}
	
	// Create a method that accendts 2 numbers and returns the result by subtracting small number
	// from the bigger number
	// Option 1
	public static int resultSubtract(int a, int b) {
	int	total = 0;
		if(a < b) {
		total =	b - a;
		}else if (a > b) {
			total = a - b;
		}else {
			System.out.println("The numbers are the same");
		}
		return total;
	}
	// Option 2 (does the same as above, but with multiple return statements
	public static int resultSubtract2(int a, int b) {
		if(a > b) {
			return a - b;
		}else if(b > a) {
			return b - a;
		}else {
			System.out.println("The numbers are the same");
		}
		return b - a;
	}
	
	
	
	/*
	 * Create a method that will take two Strings
	 * A text and a word
	 * The method should check if the word appears in the text without considering Case Sens
	 * Return true or false 
	 */
	
	public static boolean containsIgnoreCase(String text, String word) {
		
	String	textMod = text.toLowerCase(); // This is my text! -> this is my text!
	String	wordMod = word.toLowerCase(); // Text -> text
	boolean result = textMod.contains(wordMod);
	return result;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 *  The return types can be:
	 *  - All primitive data types
	 *  - Non primitive data types (reference types) - String, Scan etc etc
	 *  - Data structures - arrays, 2D arrays etc..
	 */
	
	
	
	
	
	/*
	 *This method should take two strings, first name and last name.
	 *Then return a generated yoll email
	 *firstName = Omar
	 *lastName = Ramo 
	 *return = omar_ramo@yoll.io
	 */
	
	public static String generateEmail(String firstName, String lastName) {
		
		String result = firstName + "_" + lastName + "@yoll.io";
		return result.toLowerCase();
	}
	
	
	
		/*
		 * Method should take two inputs: 
		 * Price and tax rate
		 * it should return the total price with tax
		 * */
	
	public static double calculateTax(double price, double tax) {
		
		double total = price + (price * tax / 100);
		total = Math.round(total * 100.0) / 100.0; // Will round to 2 decimal points
		return total;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Method that prints Hi!
	 * It doesn't need to startecify the return type, because it's doing a job. It isn't doing computations to return a value.
	 * the sayHi() method is void and it won't return anything. It just prints.
	 * */
		public static void sayHi() {
			System.out.println("Hi!");
		}
		
		// You can invoke a method inside another method
		public static void anotherMethod() {
			sayHi();
		}
		
		
		public static void addNums(int a, int b) {
			
			System.out.println(a + b);
			
		}
		
		
		public static int addNumsMK2(int a, int b) {
		// Every method that has a return type should have a return statement
		//	return expression; expression has to evaluate to the same data type as return
			int result = a + b;
			return result;
 		
			
		}
	
		
		
		
		
}
