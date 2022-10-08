package module2;

import java.util.Scanner;

// Below is how I imported the Scanner manually, by typing out the command.
//import java.util.Scanner;
public class Lesson1 {

	public static void main(String[] args) {
		
		                          /*SWAPPING VARIABLES, USING SCANNER AND input.next();*/
		
		
		
		
		// we have an a and b variable
		int a = 10;
		int b = 20;
		
		// write a logic that will swap the values 
		// a = 20
		// b = 10
		
		// OPTION 1 - MATH OPERATIONS
//		a = a + b; // 10 + 20 = 30
//		b = a - b; // 30 - 20 = 10
//		a = a - b; // 30 - 10 = 20 
	
//		System.out.println("Value of a: " + a);
//		System.out.println("Value of b: " + b);
		// Above is an example of how to swap values, there's more than 1 way to do it.
		 
		
		// OPTION 2 - USING 3RD VARIABLE 
		// Think of it as containers, like cups of coffee. If you wanted to get liquid from one cup and switch
		// it with the liquid of the other cup, it's not possible with only 2 cups. You'll just mix the liquids.
		// You'd need a third cup.
		
		int temp = a;
		// by putting a into the "temp" variable, a becomes available.
		a = b;
		// now b is inside the a box, that became available with the use of temp
		b = temp;
		// by putting temp inside of b, the original value of a was placed inside of b
		
		
		
		
//		
//		// This approach is called hard coding
//		// Store name in a variable
//		String name = "Daniel";
//		// Store age in a variable
//		int age = 22;
//		
//	System.out.println("Name: " + name);
//	System.out.println("Age: " + age);
//		
		
		// System.out - You want your system to make an output.
		// Scanner comes predefined from Java
		
		// Scanner - the type of object
		// input (think of input as a variable name, you can name it whatever you want) - the object name/variable
		// new Scanner() - Creates a new object in the memory
		// System.in - suite that will allow you to take input
// 		Scanner input = new Scanner(System.in);
//	
//		System.out.println("Please enter your name: ");
// 		String name = input.next();
//		System.out.println("Please enter your age: ");
//		int age = input.nextInt();
//		
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
//		
		
//		// Create a new Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt user to enter an integer
//		System.out.println("Enter an integer ");
//		// Take the integer input and assign to an int variable
//		int num = input.nextInt();
//	
//		// Do the same stends for all the other data types
//		System.out.println("Enter a big integer ");
//		long bigInteger = input.nextLong();
//		
//		System.out.println("Enter a decimal ");
//		double decimal = input.nextDouble();
//		
//	    System.out.println("Enter a word ");
//	    String word = input.next();
//	    
//	    System.out.println("Integer: " + num);
//	    System.out.println("Big Integer: " + bigInteger);
//	    System.out.println("Decimal: " + decimal);
//	    System.out.println("Word: " + word);
//		
		
		
		
//		System.out.println("Enter the price of the item: "); // I placed this here so the user knows what they should do.
//		double price = input.nextDouble();
//		
//		System.out.println(price);
//        String name = input.next(); // The next() will take the input till the first startace.
//        String name = input.nextLine(); // the nextLine() will take input for the whole line, including startaces.        
//		
//		System.out.println("Your name is: " + name);
		
		
		        /*TASK 1*/
//		System.out.println("Welcome. Enter a number: ");
//		int num = input.nextInt();
//		System.out.println("You entered:\n " + num);
		
		
	               /*TASK 2*/
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter your name: ");
//		String name = input.next();
//		
//		System.out.println("Please enter the price of your first item: ");
//		double price1 = input.nextDouble();
//		
//		System.out.println("Please enter the price of your second item: ");
//		double price2 = input.nextDouble();
//		
//		System.out.println("Thank you " + name);
//		System.out.println("First item price: $" + price1);
//		System.out.println("Second item price: $" + price2);

		
		
		
		Scanner input = new Scanner(System.in);


		
        System.out.println("How many salmon did you catch?");
        int fishCaught = input.nextInt();
        
      
        double fishWeight = fishCaught * 9.567;
        
       System.out.println("The average weight of your salmon comes out to: " + fishWeight +" lb ");
       
       System.out.println("The number of filets you'll have is around: " + fishCaught * 4);
        
        System.out.println("Congrats!");
        
//		
//		System.out.println("How many lemonades do you want?");
//		// 10\n --> \n
//		int numberOfLemonades = input.nextInt();
//		// to solve the issue with nextLine we include before it a dummy nextLine()
//		input.nextLine();
//		// the dummy nextLine above just eats the previous \n so the code doesn't skip a line.
//		
//        System.out.println("What is your name?");
//        // 
////        String customersName = input.next();
//          String customersName = input.nextLine(); // Using nextLine because the customers name may have a startace in it
//        // nextLine made the program skip asking the customer for input on their name. 
//        
//        
//        System.out.println("Thank you, " + customersName);
//		// The regular price for lemonade is $5
//        System.out.println("Your total is: $" + (numberOfLemonades *5));	
		
        
        
	}

}
