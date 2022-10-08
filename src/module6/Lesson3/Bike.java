package module6.Lesson3;

public class Bike {
	/* Define/Declare State */
	public int 		     id;
	public String 	  model;
	public String  	   type;
	public String 	  color;
	public double 	  price;
	public boolean isOnSale;
	
				/* DEFAULT CONSTRUCTOR - No - Args constructor*/
	// The name of the constructor should always be the same as Class name.
	// The constructor can not have any return type (even void)
	// All of the access modifiers are allowed for constructors(private, default, protected, public) 
	// modifiers NOT ALLOWED: static, final, abstract, synchronized.
	// Since the constructor uses the name of the class, it will usually be uppercase.
	
	// If we make our constructor private, we can not create an object outside of the class.
	// 		- This concept is used when you don't want to have multiple objects from one class.
	// 		- In this case we use Singleton Design Pattern that uses private constructor.
	// Every class has a constructor weather we create one or not.
	
		/* No Args constructor/default constructor */
		public Bike(){
			System.out.println("New bike has been created!");
		}
		
		// SIGNATURE = NAME OF METHOD/CONSTRUCTOR & PARAMETERS
		
		// this. refers to a variable or a method of the object.
		// this() refers to the constructor.
		// this() must always be on the first line of a constructor.
		
		
		
		/* PARAMETERIZED CONSTRUCTOR - will take values and initialize the state at the object creation.*/
		// We need to use THIS keyword to point to the object.
		// It's saying take the model we enter in the constructor parameter and put the value into THIS.model
		// (the model that belongs to the class)
		// Once a parameterized constructor is created, the default constructor will not be called automatically anymore.
		/* Constructor Overloading */	
  // Having multiple constructors with the same name, but different signatures.
		
		/* Constructor Overloading happens when: */
		// - Has different number of parameters
		// - Has different types of parameters. (same number but different types)
		// - Order of parameters is different
		
			/* Two args constructor*/
			public Bike(String model, String type) {
				this.model = model;
				this.type  = type;
			}
			
			/* Three args constructor */
		public Bike(String model, String type, String color) {
				this(model, type);
				this.color = color;
			}
			

			/* 5 args constructor */
		// Because of the this() keyword, if we use the 5 args constructor, it will call a total of 3 constructors.
		// We're chaining constructors to avoid duplicate entries.
		public Bike(String model, String type, String color, double price, boolean isOnSale) {
			this(model, type, color);
			this.price    = price;
			this.isOnSale = isOnSale;
			
			}
	
	/* Define a method that prints the state of the object */
	public void printInfo() {
		System.out.println("----------------------------------------------");
		System.out.println("Model: "  	  + model);
		System.out.println("Type: "   	  + type);
		System.out.println("Color: "  	  + color);
		System.out.println("Price: $" 	  + price);
		System.out.println("Is on sale: " + isOnSale);
		System.out.println("----------------------------------------------");
	}
	
	
}
