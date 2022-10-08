package module5;

import java.util.Scanner;

/*
 * METHODS PRACTICE
  	 Every time we need to start with method declaration
	
	 public - access modifier that tells us the method can be accessed in the whole project
	
	 static - modifier that marks the method as static method, which can be called by class name.
	
	 return_type - it tells us if the method gives something in return. For now, we will use void which means there is nothing in return.
	
	 () - this indicates that it is a method 
	
	 {} - scope, or block of code.
  
 */
public class Lesson1 { // Class beginning scope

	// If we have two methods calling from each other, it will make an infinite loop.  
	// An example of this would be to put sayBye() into the scope of the sayHello() method, and sayHello() into the scope of
	// sayBye() meaning every time you use sayHello(), it calls back to sayBye() which calls back to sayHello() infinitely
	
	
	
	
	
	// Main method is the entry point of Java to execute the code
	
	public static void main(String[] args) { // main method beginning scope
	Scanner scan = new Scanner(System.in);
		//                                                    METHODS
		// A method in Java is a block of code that has a name, that we can call upon whenever we need. 
		// Method is also called a function, or a procedure. But in Java, we refer to them as methods.
		// It's a way to organize our code, and it's most importantly reusable.
		// There are Standard Library Methods (methods already declared by Java, like println(), nextInt(), charAt(), etc..)
		// There are also User-defined methods(methods the user creates that can be invoked)
		// The order of the methods DO NOT matter.
		// To navigate to a method's declaration we can use a shortcut: Control + Left Click
	
		// INSTEAD OF RendEATING FOR LOOPS OVER AND OVER YOU CAN MAKE METHODS
        
	    
		//     The values that we pass in the method call(invocation) are called arguments
		//     So you insert the arguments into the parenthesis to make a method not hard coded.
		// 	   Pay attention to the fact that arguments are just variables, or hard coded values
	    //     Parameters have to be declared with data type in front of it.
//        printResult(10, 10); 
        
        // Below is the same thing as above, excendt we can use a Scanner for the input.
//        System.out.println("Enter a number: ");
//        int num = scan.nextInt();
//        System.out.println("Enter another number");
//        int num2 = scan.nextInt();
//		printResult(num, num2); 
		
	//	printResult(num, "Hello"); // WILL NOT WORK, NOT THE RIGHT DATA TYPE
		
//		makeCoffee("Estartresso", "cold");
		// this is a method I wrote to count from 1-100 using for loops.
//		countNumbers();
//	
//		//method to print the name John
//		printName();
//		
//		System.out.println("Wake up");
//		
//	    exercise();
//		
//		System.out.println("Take a shower");
//	// to use an already declared method, we need to call(invoke) it 	
//	// We need to use the identifier
//		
//		brewCoffee();
//		
//		System.out.println("Go to work");
//		
//		brewCoffee();
//		
//		System.out.println("Finished the work");
//		
//		System.out.println("Got home");
//		
//		exercise();
//		
//		System.out.println("Study");
//		
//		// I'm leaving this block of code to show how much more concise we have made the code by using methods.
//		System.out.println("Brew a coffee: ");
//		System.out.println(" Add water");
//		System.out.println(" Clear the filter");
//		System.out.println(" Add the coffee beans");
//		System.out.println(" Choose the type of coffee");
//		System.out.println(" Press start");
		
		
        
        // COFFEE TASK
		// Ask user what type of coffee they want
//		System.out.println("What type of coffee do you want?");
//		String coffeeType = scan.nextLine();
//		System.out.println("Hot or cold?");
//		String t = scan.nextLine();
//		makeCoffee(coffeeType, t);
//		// By putting coffeeType in the parenthesis, we're taking that value and moving it to the coffeeType variable in the method
//		// So that it's dynamic
		
        
     //   Create a method called customCounter that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.


     //   customCounter (new int[]{6,3,-1,4,9,-4,0});		→ notice different way of passing array
    //    will output:
     //   positives:3, negatives:2, zeros:1
        

//		int [] arr = {6,3,-1,4,9,-4,0, 5, -7, 0, 0, -13};
//       
//        customCounter(arr);
        
        
        /*Create an array with cities:
"New York", "London", "Baku", "Istanbul", "Baku", "Los Angeles", "London", "Baku"
Create a method that gets an array of strings and a string
It counts how many times a string appears in the array and prints the count.
E.g: 
String [] cities;
cityFinder(cities, "Baku");*/
        
        
    	// The outer loop will access each row, storing each row into the temporary variable eachAppArr for easy access
//		for(String[] eachAppArr : apps ) {
//			
//			// The inner loop gets a new string from every row, one by one
//			for(String eachApp : eachAppArr) {
//				System.out.println(eachApp);
//			}
//			
//		}
        
        
        // THIS IS AS FAR AS I GOT 
//        String [] cities = {"New York", "London", "Baku", "Istanbul", "Baku", "Los Angeles", "London", "Baku"};
//        int numberOftimes = 0;
//       String startecificCity = "";
//       for(int i = 0; i < cities.length; i++) {
//    	   if(cities[i].equalsIgnoreCase(startecificCity)) {
//    		   System.out.println();
//    	   }
//       }
        // TEACHER SOLUTION BELOW (IT WAS TURNED INTO A METHOD)
     //  public static void cityFinder(String [] arr, String cityName) {
   		
//   		int count = 0;
//   		
//   		for (String string : arr) {
//   			
//   			if(string.equalsIgnoreCase(cityName)) {
//   				
//   				count++;
//   				
//   			}else {
//   				
//   				continue;
//   				
//   			}
//   			
//   		}
//   		
//   		System.out.println(count);
//   		
//   	}
        
        
        
        
        

	} // Main method ending scope (You can not go into the main method scope to make a new method)

	// We can declare new methods here
	
	// basic syntax of a method
	//	public static return_type method_name () {
		// statements
//	}


	
	// Method header - It includes modifiers return_type method_name(parameters list)
	// Method signature - it includes the method identifier(name) and the parameters list
	//                              Method header
	// |----------------------------------------------------------------------------------------|
	//                              Method signature
	//                 |-----------------------------------------|
	// Declare a method that will take a coffee type and print that the coffee is being prendared.
	public static void customCounter(int [] arr) {
		
        int positive = 0, negative = 0, zero = 0;
        
        
        
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				positive++;
			}else if(arr[i] == 0) {
				zero++;
			}else {
		      negative++;
			}
        }	
        System.out.println("Positives: " + positive + ", negatives: " +negative+ ", zeros: " + zero);
		
	}
	
	
	
	
	public static void makeCoffee(String coffeeType, String temp) {
		
		System.out.println("Your " + coffeeType + " is being prendared...");
		
		if(temp.equalsIgnoreCase("Hot")) {
			System.out.println("The coffee is hot, so be careful!");
		}else {
			System.out.println("We add caramel to cold drinks...");
		}
		
	}
	
	
	public static void countNumbers() {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
//	public static void  brewCoffee() {
//		System.out.println("****************");
//		System.out.println("Brew a coffee: ");
//		System.out.println(" Add water");
//		System.out.println(" Clear the filter");
//		System.out.println(" Add the coffee beans");
//		System.out.println(" Choose the type of coffee");
//		System.out.println(" Press start");
//		System.out.println("****************");
//	}
	 
	public static void exercise() {
		System.out.println("---------------");
		System.out.println("Exercise");
		System.out.println(" - Warm up");
		System.out.println(" - Push ups");
		System.out.println(" - Pull ups");
		System.out.println(" - Squats");
		System.out.println("---------------");
	}
	
	// This method has a local variable and prints the name
	public static void printName() {
		String name = "John";
		System.out.println(name);
	}
	
	// Method that says hello
	public static void sayHello() {
		System.out.println("Hello!");
	}
	
	// Method that says bye
	public static void sayBye() {
		System.out.println("Bye!");
	}
	
	// Instead of hardcoding methods, you can use parameters.
	// Method will take 2 numbers as input and multiply them, then print the result.
	// We declare parameters in the parenthesis of the method
	// We need to startecify the data type and the variable name.
	// If we have few params we can list them with comma sendarating them.
	// The variables inside the parenthesis will be local to the method, you can use them later in the method.
	// The values will come from inside the main method. 
	// int a and int b - called parameters. 
	// If we don't give a and b values inside the main method, the method we created will not work.
	
	
	// Below is an example of what it would look like when I use the method we created inside the main method.
	// printResult(10, 10);
	
	public static void printResult(int a, int b) {
	
		int result = a * b;
		System.out.println(result);
		
	}
	

	
	
	
	
} // Class ending scope
