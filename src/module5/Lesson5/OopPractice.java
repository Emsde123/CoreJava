package module5.Lesson5;

import java.util.Scanner;

import module5.Lesson4.OOPBasics.*;

public class OopPractice {

	public static void main(String[] args) {
		
		// Think about classes like cookie cutters, and objects as the cookies.
		// All the cookies that were created with the same cookie cutter will have similar characteristics
		// Squirrel cookies will have tails, paws, buck teeth.
		// Owl cookies will have talons, feathers, beak. 
		// Some owl cookies can be different colors or patterns, even though they were made with the same cookie cutter. 
		// Okay little wetawd? You got that little dummy? You like thinking about cookies? Fuckin pussy.
		
		// Object is an instance of a class 
		// It contains an address and takes up startace in the memory
		// Creating an object is called instantiation
		
		
		
		// Create an Object
		// We already created many objects of Scanner class, String class, etc...
		
		// Example of us creating objects below
		// Scanner scan = new Scanner(System.in);
		// String name = new String("Omar");
		
		// Create a car object 
		// The process of creating an object is called - Instantiation 
		// 1. Provide/Declare the type (Data, class, etc)
		// 2. Name the object
		// 3. Use new keyword to instantiate the object in the heap memory
		// 4. Use the constructor to initialize the fields
		
		// Here we used the car class to make a NEW object
		//	Car myCar = new Car();
		// The above object will have it's own fields, if we create a new object called myCar2 then the values wouldn't be the same
		// it would all be NULL again.
		
		
	
		// Now let's access the behavior of the car object.
		// To access any method we need to use object name then "." and method name
		
		
	//	myCar.startEngine(); // The engine has started...
		
	//	myCar.stopEngine(); // Called another method
		
		// Access the fields of the object
//		System.out.println("Make: " + myCar.make);
//		System.out.println("Model: " + myCar.model);
//		System.out.println("VIN: " + myCar.VIN);
//		System.out.println("Year: " + myCar.year);
		
		
		// Initialize the instance variables/fields0
//		myCar.make = "BMW";
//		myCar.year = 2022;
//		myCar.model = "X5";
//		myCar.VIN = "VIN40247113145";
		
//		System.out.println("Make: " + myCar.make);
//		System.out.println("Model: " + myCar.model);
//		System.out.println("VIN: " + myCar.VIN);
//		System.out.println("Year: " + myCar.year);
		
		
		// CREATE A METHOD THAT WILL PRINT THE INFO/FIELDS

//		myCar.printInfo();
//		
//		// We can create from a class as many objects as we need
//		Car danielsCar = new Car();
//		danielsCar.make = "Lexus";
//		danielsCar.model = "RX300";
//		danielsCar.year = 2003;
//		danielsCar.VIN = "VIN57826422";
//		danielsCar.carColor = "Gold";
//		danielsCar.doorCount = 4;
//		danielsCar.tankCapacity = 16;
//		
//		// We can also have methods with return
//		// also we can take arguments
//		danielsCar.printInfo();
//		double finalPrice = danielsCar.fullTankCost(5.5);
//		
//		System.out.println("The total cost to fill up the tank is: $" + finalPrice);
		
		// Notice how we're using methods we defined in car class, but not the same object. This is Daniels car.
		// The logic is that we leave the methods dynamic, allowing us to enter new variables for each object. 
		// If we hardcoded the make and model in the Car class then it wouldn't be a bluendrint anymore.
		
		// You can reassign the values for the fields at any time
//		danielsCar.carColor = "Blue"; 
//		
//		System.out.println("After color change");
//		danielsCar.printInfo(); 
		
//		
//		House myHouse = new House();
//		myHouse.numberOfWindows = 52;
//		myHouse.numberOfRooms = 8;
//		myHouse.numberOfStories = 3;
//		myHouse.address = "1923 Sherman Ave, Madison WI, 53704";
//		myHouse.hastartool = true;
//		myHouse.hastartatio = false;
//		myHouse.yearBuilt = 1998;
//		
//		myHouse.printInfo();
		
	//	Rectangle myRectangle = new Rectangle();
		
	//	myRectangle.length = 15;
	//	myRectangle.width = 10;
		
		// Prints area, length, and width.
	//	myRectangle.printInfo();
		
		
		
		
		
		
		
		
		
	}

}
