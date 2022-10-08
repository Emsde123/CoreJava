package module5.Lesson5;

public class Student {
	// Instance variables 
	// State - Fields (attributes)
	// Instance variables are variables used to store the state of an object.
	// All the instance variables will be accessible to other instance methods
	// We can say it's global to this class.
	String firstName;
	String lastName;
	String email;
	double gpa;
	
	
final static String SCHOOL_NAME = "Yoll academy";
	// Static variables are shared among all instances of the object.
	
	
	
	
	// All of the above are instance variables
	// So every time we create a Student object (Student student1 = new Student();)
	
	// Each object in the Student class will have it's own copy of each instance variable.
	// They are called instance variables because there are multiple instances of each variable.
	// For example, above we have a String lastName. One instance of the Student object could be "Smith", while I can assign a different String to the variable
	// if I'm using a different object instance.
	
	
	String getFullName() {
		// fullName is a local variable, only accessible in the scope of this method.
		String fullName = firstName + " " + lastName;
		return fullName;
	//  increase will not work here, because it is a local variable.
	//	increase = 0;
	}
	
	void increaseGpa() {
		double increase = 0.1;
		gpa += increase;
		// every time this method is called it increases the GPA by 0.1
		// System.out.println(fullName + " your gpa was increased!"); // If you uncomment this it will not work. This is because fullName is a local variable.
	}
	
	
	// INSTANCE METHODS CAN CALL ANYTHING FROM ANYWHERE
	void instanceMethod() {
		System.out.println(firstName);
		System.out.println(SCHOOL_NAME);
		getFullName();
		staticMethod();
	}
	
	// STATIC METHODS CAN ONLY INTERACT WITH STATIC VARIABLES, AND STATIC METHODS
	static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	
	
	
	
	
}
