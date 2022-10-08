package module6;

import java.util.ArrayList;
import java.util.Arrays;

import module5.Lesson4.Car;

public class MemoryPractice {

	public static void main(String[] args) {
		
		
		//                       ---  JVM Heap stack ---
		// Heap -> contains Objects (may also contain reference variables)
		// Stack -> contains methods, local variables, and reference variables
		
		/*                ---STACK MEMORY---
		 * Stack memory is dynamic, in the printAddition below it was shown to us.
		 * When we used x and y for the variable int a and int b in the method, 10 and 20 were temporarily assigned to a and b 
		 * after the calculation was done, they were erased and the value was printed as the sum. 
		 * TEMPORARY MEMORY once the method is finished, the method containing the values are cleared to make room for more variables.
		 * */
		
//	       int x = 10;
//	       int y = 20;
	       
	       // Methods call
	       // Stack memory gets dealocated automatically once the method is executed
//	       printAddition(x, y); // 30
	       
	       int [] arr = {1, 2, 3}; // Contents of the array are stored in Heap memory, while the reference (arr) is stored in stack.
	       
//	       Car myCar = new Car(); // -------> NEW OBJECT (reference(myCar) is stored in stack, while the object itself is stored in heap) 
	       
//	       Car wifesCar = new Car(); // ----> NEW OBJECT (reference(wifesCar) stored in stack, while the object itself is in the heap memory)
	       
	       // Destroy an object by reassigning to another reference. 
	       // Example: myCar = wifesCar;
	       // Garbage collector will come and haul myCar off
	       // Example2: myCar = null; 
	       // Example2a: wifesCar = null; 
	       // Both instances will be destroyed by GC
	       
	       
	       
	       
	       /*    ---HEAP MEMORY---
	        * Think of heap like a box split into 3 sections
	        * - It stores the actual objects, and may hold reference variables
	        * - Instance variables are created in the heap
	        * 
	        * ------------------------------------------------------------------------------------------------------------------------------------------
	        * Young Generation
	        * - This is a place where code is short lived and it's divided into 2 spaces
	        * 
	        * - Eden(Garden of Eden) space:  When object is created using new keyword it's stored on this space
	        * 
	        * - Survivor Space: The pool that contains objects which have survived after java garbage collection from eden space
	        * 
	        * ------------------------------------------------------------------------------------------------------------------------------------------
	        * Old Generation
	        * - Basically holds the tenured and virtual space and will be holding the objects which survived the garbage collection from Survivor space
	        * ------------------------------------------------------------------------------------------------------------------------------------------
	        * MetaSpace
	        * - Perm Generation was removed and replaced by MetaSpace, it's more reliable than Perm Generation.
	        * 
	        * */ 
	       
	       
	       
	       /* ---GARBAGE COLLECTOR---
	        * - In java, garbage means unreferenced objects
	        * - Heap memory is NOT deallocated right after code execution, like stack is.
	        * - Heap needs a Garbage Collector to free up unused objects so as to keep the efficiency of the memory usage
	        * -------------------------------------------------------------------------------------------------------------------------------------------
	        * - Garbage collection is the process of destroying unused objects to free up space in the Heap memory
	        *   - it is automatic in Java, meaning you don't have to worry about unused memory
	        * - Garbage collection is run by JVM and we don't know when it runs
	        *   - We can also manually request JVM to run GC by using System.gc();
	        *     - We are asking GC to run, it may or may not run. We can't force it.
	        * */
		
	       
	       //                                       WRAPPER CLASS
	       /*Each primitive data type has it's alternative as non-primitive data type*/
	       /*These classes are called Wrapper Class*/
	       /*
	        * ------------------------------------------------------------------------------------------------------------------------------------------
	        * int     -> Integer
	        * long    -> Long
	        * float   -> Float
	        * double  -> Double
	        * boolean -> Boolean
	        * char    -> Character
	        * 
	        * int [] arr;
	        * ArrayList<Integer>myList;
	        * 
	        * 
	        * The non-primitive data types have default methods. 
	        * int is just a primitive data type, no methods.
	        * */
	       
	// ------------------------------------------------------------------------------------------------------------------------------------------       
	       /*   Boxing - AKA - AutoBoxing    */ 

	   //    int x = 10;
	       
	       // When we assign a primitive variable OR value to a wrapper class, it is called "boxing / auto boxing"
	       
	     //  Integer intObj = x; // Interger.valueOf(x); <- AUTOBOXING (when java does it by itself)
	    //   System.out.println(intObj); // Prints 10, because Java understands this is a reference type
	       
	       //Option 2 is when we assign a primitive value (auto boxing)
	       // Turns a value into a powerful integer that has it's own methods
	   //    Integer xObj = 100; // Integer.valueOf(100) <- AUTOBOXING
   // ------------------------------------------------------------------------------------------------------------------------------------------	       
	       			/*Unboxing*/
	       // Unboxing is the opposite of boxing/auto boxing
	       
	       // Option 1 We can create a Wrapper class object the classic way with the new keyword
	       // however this option is outdated after Java 9
	    //   Integer myObj = new Integer(900);
	       
	       // Option 2 we can also create an object of wrapper class by using valueOf() method
	    //   Integer myObj = Integer.valueOf(800);
	       
	       // The process of assigning a reference type to a primitive variable is called unboxing
	    //   int num = myObj;
	     //  System.out.println(num); // 900
  // ------------------------------------------------------------------------------------------------------------------------------------------	       
	       
	       // Practice 
	       // Create wrapper classes for the 4 data types below
	       // Assign them to primitive literal valeues
	      
	       // Boxing   |  go from low to high (int -> Integer) / (primitive -> non-primitive)
//	       Integer myInt3 = 10;
//	       Double myDouble = 20.00;
//	       Character myChar = 'D';
//	       Boolean myBoo = false;
//	       
//	        // Create primitive data type variables and assign wrapper classes to them
//	       //  Unboxing  | go from high to low (Integer -> int) / (non-primitive -> primitive)
//	       boolean myBoo2 = myBoo;
//	       char myChar2 = myChar;
//	       double myDouble2 = myDouble;
//	       int myInt4 = myInt3;
//	       
//	       // Then print all the values
//	       System.out.println(myBoo + " " + myChar + " " + myDouble + " " + myInt);
//	       
//	       // Wrapper class integer
//	       // ArrayList<Integer>myList;     
// //------------------------------------------------------------------------------------------------------------------------------------------	 
//	       //                                COMPARISONS
//	       
//	       int a = 10;
//	       int b = 10;
//	       System.out.println(a == b);            // TRUE
//	       
//	       String str1 = "Hi"; // 			   str1 will be created in the String Pool
//	       String str2 = new String ("Hi"); // Since we used the new keyword, str2 will become a new object in the heap memory.
//	       
//	       System.out.println(str1 == str2);      // FALSE (becaue they are not the SAME objects) 
//	       System.out.println(str1.equals(str2)); // TRUE  (because it checks the VALUE itself, not weather it's the same object.)
//	       
//	       // Wrapper classes
//	       double x = 10.5;
//	       double y = 10.5;
//	       
//	       Double f = 10.5;
//	       Double d = 10.5;
//	       
//	       System.out.println(x == y); // TRUE  -> two primitive data types
//	       System.out.println(x == f); // TRUE  -> f will be unboxed and checked as two primitive values
//	       System.out.println(f == d); // FALSE -> checks if f and d are pointing to the same object
	       
	       
//      System.out.println('A' == 65); // TRUE (it compares with ASCII value)
	       
	       
	       										// Primitive type assignment 
//			int myInt = 10;    // myInt value is 10
//			int myInt2 = myInt;  // take the value of myInt and copy it into myInt2 
//			System.out.println("myInt = " + myInt);
//			System.out.println("myInt2 = " + myInt2);
//	       
//	        myInt++;
//	        		//						11
//			System.out.println("myInt = " + myInt);
//			        //                       10
//			System.out.println("myInt2 = " + myInt2);
//	       
//	       
//			int i = 1;
//			int j = 2;
//			
//			System.out.println("i = " + i); // 1
//	        System.out.println("j = " + j); // 2
//	       
//	       i = j; // i = 2
//	       j = j - i; // j = 0 (2 - 2 = 0
//	       
//	   	System.out.println("i = " + i); // 2
//        System.out.println("j = " + j); // 0
	       
	       
	       
	       // Create a car instance and initialize it.
	       Car myCar = new Car();
	       myCar.make = "Nissan";
	       myCar.model = "350z";
	       myCar.carColor = "Black";
	       myCar.VIN = "HGASPDH2212";
	       
	       
	       // Create a new car instance and initialize it.
//	       Car wifesCar = new Car();
//	       wifesCar.make = "Lexus";
//	       wifesCar.model = "rx300";
//	       wifesCar.carColor = "Gold";
//	       wifesCar.VIN = "VNSIY231621";
//	       
////	       System.out.print("myCar info ->");
////	       myCar.printInfo();
////	       System.out.print("wifesCar info ->");
////	       wifesCar.printInfo();
//	       
//	       
//	       myCar = wifesCar;
//	       System.out.println("After exchange: ");
//	       System.out.print("myCar info ->");
//	       myCar.printInfo();
//	       System.out.print("wifesCar info ->");
//	       wifesCar.printInfo();
	       
	       
	       														// ARRAY OBJECT MUTATION
	       int [] x = {10, 20, 30, 40, 50};
	       int [] y = x;
	       
	       System.out.println("Array x: " + Arrays.toString(x));
	       System.out.println("Array y: " + Arrays.toString(y));
	       // This will print two identical arrays in the console, but they're pointing to the same object (array).
	       
	       y[1] = 999;
	       System.out.println("Array x: " + Arrays.toString(x));
	       System.out.println("Array y: " + Arrays.toString(y));
	       // Both arrays will now show 999 in index 1.
	       
	       // PRIMITIVE DATA TYPES ALWAYS NEED A VALUE. NEVER NULL. 
	       // REFERENCE DATA TYPE CAN BE NULL.
	       
	       
	       
	       //                                   IMMUTABLE & MUTABLE 
	       // Mutable - means the objects in heap can be modified (Car object can have red color and we can change it to black)
	       // Immutable - means we can not change the value of the object in the heap memory. (Primitive and String immutable)
	       // Every time we give a new value, a new object is created.
	       
	       
	       
//	       String password1 = "Yoll";
//	       String password2 = "Academy";
//	       
//	       System.out.println("password1 = " + password1); // Yoll
//	       System.out.println("password2 = " + password2); // Academy
//	       
//	       // When we do this, password1 isn't getting "changed" to Academy. It's making password1 point to the same object that password2 points to.
//	       password1 = password2; // password1 = "Academy"
//	       
//	       System.out.println("password1 = " + password1); // Academy
//	       System.out.println("password2 = " + password2); // Academy
//	       
//	       // Here, a new object is being created. It is not changing the value of password2, it's storing the old value in heap and then pointing to the new value
//	       // as a new object.
//	       password2 = "New Pass"; 
//	       
//	       System.out.println("After password2 change ");
//	       System.out.println("password1 = " + password1); // Academy
//	       System.out.println("password2 = " + password2); // New Pass
//	       
//	       
//	       // Primitives are immutable, which means they can be used without any special care.
//	       // Objects are mutable by default.
	       
	       
	       // Java is Pass by Value
	       
//	       int a = 2;
//	       
//	       changeValue(a);  // Should change value of a to 100, but doesn't.
//	       
//	       // What is happening when we call the method to change the value:
//	       // When we call the method, a gets passed into the parameter as a copy. So it copies the value (2) into the method
//	       // It changes the value of "a" to 100, but it doesn't get applied to 
//	       // int a = 2. This is because "a" is a local variable, so the block inside the method scope won't be able to affect it. 
//	       // That's why we say Java is Pass by Value, if we passed value instead of a local variable it would have worked.
//	       
//	       System.out.println("a = " + a); // 2 
	       
	       
//	       Car wifesCar = new Car();
//	       wifesCar.make = "Lexus";
//	       wifesCar.model = "rx300";
//	       wifesCar.carColor = "Gold";
//	       wifesCar.VIN = "VNSIY231621";
//	       wifesCar.year = 2003;
//	       wifesCar.doorCount = 4;
//	       
//	       wifesCar.printInfo(); // Color is gold
//	       
//	       
//	       changeColor(wifesCar); // Copy of address (reference address) is passed to method
//	       // So when we pass the address of wifesCar to the method that has car as the parameter, it changes the color of car but then points it
//	       // to the address of wifesCar. Thus, changing the color of wifesCar to the color of car (black)
//	       
//	       
//	       wifesCar.printInfo(); // Color is Black (referencing wifesCar object which just had its color changed to the color of the car object)
//	       
//	       
	       
//  												ACCESS MODIFIERS
	       // access modifiers are keywords that set the accessibility (visibility) of class, method, variable, etc.
	       // By using the access modifiers we limit which resources can access our class, method, variable, etc.
	       // There are 4 types of access modifiers.
	       
	       // - Default (Accessible only within the same package)
	       //     Only you and your wife can be in the house
	        
	       // - Private (Accessible from only the same class)
	       //     You are in the restroom
	       
	       // - Protected (Accessible inside the same package + subclass of that class from other packages through inheritance. (Very close to default)
	       //     You and your children can visit the house
	       
	       // - Public (Accessible from anywhere)
	       //     Anyone can visit your house
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       

	}

	public static void printAddition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	
	public static void changeValue(int a) {
		a = 100;
	}
	
	public static void changeColor(Car car) {
		car.carColor = "Black";
	}
	
	
}
