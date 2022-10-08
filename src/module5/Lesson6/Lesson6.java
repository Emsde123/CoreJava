package module5.Lesson6; // Package file must be on the first line

import module5.Lesson4.*;




public class Lesson6 {

	public static void main(String[] args) {
		
	// There are 3 ways to import a class from a different package
		
		// Option 1 - use the full path of the class
		//	java.util.Scanner scan = new java.util.Scanner(System.in);
		
		
		// Option 2 - use import statement
		//	Scanner scan = new Scanner(System.in);
		
		
		// Option 3 - use the wild card (*)
		// for the below classes, they're all in the same package so we'd write this
		// import module5.lesson4.*
		
		House h1 = new House();
		
		Car c1 = new Car();
		
		Rectangle r1 = new Rectangle();
		
		
		// There are 3 types of variables in Java programming.
		// 1 - Instance variables (non-static fields) - Defined in the class
		// 2 - Class variables (Static fields)  
		// 3 - Local variables (inside method variables)
		
		
		
		
		
		
		
		
		
		

	}

}
