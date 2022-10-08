package module5.Lesson4;



public class Car {

	//  State - (Attributes, Data, Fields, Instance Variables)
	// The modifiers as public and static are optional here
	// It is optional to initialize the Instance Variable, because the variable is not a local variable. Value will be NULL.
	public String make;
	public String model;
	public   int year;
	// In some cases we want to give an initial value to a field, this can be changed later as long as it's not constant.
	public String VIN = "XXXXXXXXXXXXX";
	// This is a constant that we need to initialize at the beginning and each object will have the same value for the field.
	public final static String DEALERSHIP = "1Cochran";
	public int doorCount;
	public String carColor;
	public double tankCapacity;
	public static int minNumOfSeats = 2;
	
	public static int countCars;
	
	
	/* Default Constructor - No-Args Constructor*/ 
	// After making the Car() constructor, we left the AM default 
	// which made it invisible to anything outside the package.
	// It's function is to assign all the instance fields to their default values.
	// We can add logic to this constructor too. Notice how we added a syso statement, now whenever we create a new Car() object, it will print that message.
	// Car myCar = new Car() <-- The Car() is the constructor, we need to call it every time. 
	// Look at the below constructor, we added a counter to keep track of how many car objects have been created.
	// It constructs the values(provides data) for the object, that is why it's known as a constructor.
	public Car(){
		System.out.println("New car object has been created!");
		countCars++;
		year = 2022;
		tankCapacity = 25;
	}
	
	
	
	// Behavior - (Methods, Functions)
	// It is optional to use public or static modifiers
	public void startEngine() {	
		System.out.println("The engine has started...");
	}
	
	public void stopEngine() {
		System.out.println("The engine has stopped...");
	}
	
	
     public	void printInfo() {
		System.out.println("------------------");
		System.out.println("Dealership: " + DEALERSHIP);
		System.out.println("Make: " + make );
		System.out.println("Model: " + model);
		System.out.println("VIN: " + VIN );
		System.out.println("Year: " + year);
		System.out.println("Door count: " + doorCount);
		System.out.println("Car color: " + carColor);
		System.out.println("------------------");
	}
	
	public double fullTankCost(double fuelPrice) {
		return Math.round(fuelPrice * tankCapacity);
	}
	
	

	
	
	
	
	
	
	
}
