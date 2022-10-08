package module1;

public class Lesson1 {

	public static void main(String[] args) {
		
       
		// When you want to run a specific class make sure your Eclipse window is on the right class
		// To reset the view of your Eclipse use Window -> Perspective -> Reset perspective
		// First you create the package and then you create the class
	System.out.println("Hello Students");
	
	System.out.println();
	// System.out.println() shortcut is syso + ctrl + space
	// Syntax rule - Error if you dont comply
	// Convention rule - Is rule of thumb (technically we can do the other way)
	// Class has to start with a capital letter - Convention rule (because you can make a class that starts with a lowercase letter)
	// Method should start with a lowercase - Convention rule
	// Name of the class and the Java file MUST MATCH
	// System.out - Means our SYSTEM will OUTPUT something
	// println() - will print on the console
	
	
	// escape characters, or escape sequences
	// \n - new line
	System.out.println("Tomatoes\nEggs\nPotatoes");
	// \t - tab
	System.out.println("\tHello!");
	// \" - add quotes to a statement 

	// \' - include quotation mark in print (1)
	System.out.println("Hello \'Omar\'");
	
	// Linux, Unix -> user/dima/filename
	// Windows users -> users\dima\filename 
	
	// System.out.println("Users\Dima\Filename"); <----- WONT WORK
	 System.out.println("Users\\Dima\\Filename"); //<--- WILL WORK
	
//	int a = 10;
//	int b = 20;
//	System.out.println(a);
//	System.out.println(b);
//	
//	a = 50; 
//	
//	System.out.println(a);
//	System.out.println(b);

	 
	            // int - data type
	           // num - variable name/identifier
	          // = - equal sign assigns the value from the right side
	         // 10 - literal value
	 
	int num = 10;
	System.out.println(num);
	num = 35;
	System.out.println(num);
	// you only need to declare the variable type one time. Ex; if you label num as int then you don't have to do it agian.
	
	int num2 = 22;
	
	System.out.println(num + "\n" + num2);
	
	
	
	}

}