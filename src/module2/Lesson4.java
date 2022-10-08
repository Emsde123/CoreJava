package module2;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// (==) - Equal to
//		System.out.println(90 == 90); // true
//        System.out.println(25.5 == 25.5); // true
//		System.out.println(false == true); // false
//	    System.out.println('A' == 'B'); // false
		
		
//		(!=) - Not equal to
//		System.out.println(90 != 90); // false
//     System.out.println(25.5 != 25.5); // false
//		System.out.println(false != true); // true
//	    System.out.println('A' != 'B'); // true
		
		// (>) - greater than
//		int a = 10;
//		int b = 9;
//		System.out.println(a > b); // true (wouldn't work with a boolean variable, obvious reasons.)
		
//		double num = 10.9;
//	    double num2 = 11.0;
//		boolean result = num2 > num;
//		System.out.println(result); // true (look at how I did this)
		
		
//		// (<) - Less than
//		int num = 33;
//		int num2 = 20;
//		System.out.println(num < num2); // false 
//		
//		char a = 'a';
//		char b = 'b';
//		int asciiA = 'a';
//		int asciiB = 'b';
//		System.out.println("The ascii for a is: " + asciiA); // 97
//		System.out.println("The ascii for b is: " + asciiB); // 98
		
		
		// (>=) - greater than or equal to
//		System.out.println(100 > 100); // false
//		System.out.println(100 >= 100); // true (because we added the condition that they might be equal to each other.)
//		int num = 100;
//		int num2 = num++;
//		System.out.println(num >= num2);
		// I'm going to comment out the above code and do a way to test each line of code
		
//		int num = 100;
//		int num2 = num++;
//		System.out.println(num); // 101
//		System.out.println(num2); // 100 (because we assigned num++ to it and the promise had not been fulfilled yet)
//	System.out.println(num >= num2); // true ( 101 is greater than or equal to 100)
	
		
		
		// (<=) - Less than or equal to 
		
//		int a = -10;
//		int b = -9;
//	   System.out.println(a <= b); // -10 <= -9 = true
	   
//		System.out.println(101 >= 100); // true
//		System.out.println(100 >= 100); // true
	  
		 
		
 //		                                                LOGICAL OPERATORS
// Logical operators are mainly used in conditional statements for evaluating a condition
// Logical operators need two sides to work with. Can't only have one side.
//Logical operators are used with two expressions. It will only work with boolean values.
		
// (&&) - Logical AND Operator 
		// AND Operator returns true, only if both sides are true.
//	System.out.println(true && true);
//	System.out.println(false && true); // compiler will use short circuit in this case.
		
//	System.out.println(true && false);
//	System.out.println(false && false);	
		
//		boolean b1 = true;
//		boolean b2 = !false;
//		System.out.println(b1 && b2); // will print true, because we negated the false variable.
		
//		boolean result1 = 100 <= 100;
//		boolean result2 = -90 != 90;
//		System.out.println(result1 && result2); // will once again print true, 100 is less than or equal to 100. -90 is not equal to 90.
		
//		System.out.println(10 * 5 >= 50 && -90 != -90); // print false. 50 >= 50 is TRUE. -90 != -90 is FALSE so boolean prints false.
		
		
		
		// (||) - Logical OR Operator
		// OR operator will return true if any sides are true
//		System.out.println(true || true); // true // compiler will use short circuit in this case.
//		System.out.println(false || true); // true
//		System.out.println(true || false); // true // compiler will use short circuit in this case.
//		System.out.println(false || false);	 // false
//		
//		boolean b1 = true;
//		boolean b2 = !true;
//				System.out.println(b1 || b2); // true
				
				// AND and OR operators explained simply
				// Think about the two operators as two different people trying  to get to work.
				
				// AND OPERATOR
				//One person has to drive over one road that has two draw bridges.
				// That person needs to have both draw bridges lowered to get to work (a true output)
				// If one bridge is not lowering then it doesn't matter if the other is lowered (if there's one false then it wont work)
				// This is the && operator.
				
				// OR OPERATOR
				//The other person is trying to drive to work, but this time he has two roads.
				// Both roads have their own bridge, one bridge each road. 
				// If one road has a lowered draw bridge and the other is raised, the driver can take the road that has the lowered bridge.
				// They can still get to work even if one bridge is unavailable.
				// This is the || operator.
				
				
//				System.out.println(true && true); //true
//				System.out.println((false && false) || (true && true)); // true
//	            System.out.println((false || false) && (true && true)); // false
//	
//	
//	int a = 55;
//	int b = 70;
//	System.out.println(a<50);
//	System.out.println(a<b);
//
//	System.out.println(a<50 || a<b);
	
//		int a = 10, b= 5, c= 20;
		
		                 // SHORT CIRCUIT
		                 //10 < 5 && 10 < 20
		                  // false && true
//		System.out.println((a < b) && (a++ < c));
//		System.out.println(a); // this will print 10, not 11 and this is because of short circuit.
		// Look at line 145, a < b (10 < 5) is NOT true, so it won't move to the next requirement for the AND statement. It's already false.
		//This means that a could not be incremented because that side wasn't used.
		                   
		                   // TRUE   b++ would not be executed because one side was already met. This works the same if the first side was false.
//		System.out.println(a != b || b++ < a);
                        // true		      false
		                // 10 < 20       11 < 5
//		System.out.println((a++ < c ) && (a < b)); // now 'a' would print as 11. Because the increment was on the left side.
		
		
		//                      Bitwise operator - (&) (|) 
		
// System.out.println((a < b) & (a++ < c)); // bitwise will check both sides no matter what.
// System.out.println(a); // 11 (because bitwise check both sides regardless.)

// System.out.println(a != b | b++ < a); // true
// System.out.println(b);	// 6
		
/*
 * The main difference between logical and bitwise are:
 * 1. Logical operators use short-circuit, however, the bitwise does not.
 * 2. logical operators can work only with boolean, however bitwise can work with numbers.
 * 
 * */		
		
//	System.out.println(10 && 20); // logical operators need both sides as boolean expressions.	This will not run.
//	System.out.println(10 & 20); // 0 (don't worry about it)
	
		
		
		
		
		
		
		 //                                                CONVERTING / CONVERSIONS

//         There are two ways of converting a String to int or double

		
		// FIRST OPTION: parseInt() and parseDouble()
		// Convert a String that holds a numeric value to an integer data type.
		// Integer.parseInt();
		 
//		String text = "100";
//		System.out.println(text + 20); // 10020
////        int total = text + 20;  WILL NOT WORK
//		  int total = Integer.parseInt(text); // CONVERT TO INTEGER
//		 System.out.println(total); // converted to integer
//		 System.out.println(total + 20); // 120
//// STRING MUST ONLY CONTAIN NUMERIC VALUE
//		 
//
//		// Convert a String that holds a numeric value to a double data type.
//		// Double.parseDouble();
//		 String text2 = "150.99";
//		 double sum = Double.parseDouble(text2) + 10.0 ;// will evaluate to a double data type
//         System.out.println(sum); // 160.99 after converting to double and adding 10.0
//         
         
         
         // SECOND OPTION: Convert using valueOf()
         
//         String strNumber = "22";
//         int total = 100 + Integer.valueOf(strNumber); // converted and added 100
//         System.out.println(strNumber); // 22
//
//         String strNum = "120.90";
//         double sum = 100.0 + Double.valueOf(strNum);
//         System.out.println(sum);
         
         // The difference between parse methods and valueOf is that 
         // parse will automatically convert the value to a primitive data type
         // valueOf will first convert to a non primitive data type 
         // then java compiler will do conversion to primitive
         
		
		// TASK
//		   System.out.println("please enter your number below ");
//	         String stringNumber = input.nextLine();
//	       int stringConvert =  Integer.parseInt(stringNumber);
//	         System.out.println((stringConvert + 100) >= 200);
    
		
		
		// Convert a Data Type to a String
		// We can use three ways 
		
		// 1. String.valueOf();
//		int num = 100;
//		String strNum = String.valueOf(num);
//		System.out.println(strNum + 10); // 10010
//         
//		double number = 105.99;
//		String strNum2 = String.valueOf(number);
//		System.out.println(strNum2 + 20); // 105.9920
		
		
		// 2. DataType.toString();
//		int num = 22;
//		String strNumber = Integer.toString(num);
//		System.out.println(strNumber + 77); // 2277
//		
//		double number = 100.0;
//		String strNumber2 = Double.toString(number);
//		System.out.println(strNumber2 + 90); // 100.090
       
       // 3. Concatenation (Will be pretty much the best way to convert to string.
//	int	num = 44;
//	String numberString = "" + num;
//	System.out.println(numberString + 67); // 4467
//	
//	double dNum = 88.99;
//	String doubleString = "" + dNum;
//	System.out.println(doubleString + 99); // 88.9999
	
       //  String strBoolean = "true";
        // System.out.println(strBoolean == false); // won't print because it's the wrong data type
         
     // When you convert a string that contains a boolean there is no case sens
		// As long as as there are no extra characters, the conversion will happen.
//         String strBoolean = "tRue"; // case sens doesn't matter here
//         boolean convertedString = Boolean.parseBoolean(strBoolean);
//         System.out.println(convertedString == false);   // false
         
        // Will print after I convert
         
//         String strBoolean = "tRue"; 
//         boolean convertedString = Boolean.parseBoolean(strBoolean);
//         System.out.println("String as boolean: " + convertedString);
//         System.out.println(convertedString == false);   
        
//		boolean myBoolean = false;
//		String strBool = "" + myBoolean; // easiest way to convert from boolean to string
//		String strBool2 = String.valueOf(myBoolean); // 2nd way to convert from boolean to string
//		String strBool3 = Boolean.toString(myBoolean); // 3rd way to convert.
//		
//		System.out.println(strBool + strBool2 + strBool3); //falsefalsefalse
		
		
		
		
		
		
		
		
		
	}

}
