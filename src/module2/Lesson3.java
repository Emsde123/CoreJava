package module2;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		
		
		
//		/* (=) - Assignment operator takes the value from right side and assigns to the variable on the left side. */
//		int num = 100;
//		num = num + 50; // This is how you'd add a number to a variable, if you want to change the value. 
//		
//		System.out.println(num); // This will print 150 (num = 100;     num = num + 50;  syso num;) // 150
//		
//		
//		
//		
//	    /* (+=)  - shortcut for addition */ 
//		
//		int num2 = 100;
//		num2 += 50; // 150 + 50 = 200, num2 = 200 --> num = num + 50;
//		System.out.println(num); 
		
		
		/* (-=) - shortcut for subtracting   */
		
//		int num = 200;
//		num -= 20; // 200 - 20 = 180; num = 180 --> num = num - 20;
		
		
		
		
		/* (*=) - shortcut for multiplication   */
		
//		int num = 180; 
//		num *= 2;  
//		System.out.println(num); // 180 * 2 = 360; num = 360 --> num = num * 2;
		
		
		
		/* (/=) - shortcut for division*/
		
//		num /= 4; // 360 / 4 = 90; num = 90; --> num = num / 4;
		
		
		
		/*  (%=) - shortcut for modulo */
		
//		num %= 50; // 90 % 50 = 40;  -->  num = num % 50; 
		
		
		/*DISCOUNT CALCULATOR*/
	//	discountedAmount = (price * discountPercentage / 100); <--- This will get you the amount that will be discounted
    // to get the total price it looks like this:
    //totalPrice = price - discountedAmount;
		
		
		

		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Hello, please enter your name below: ");
//		String cName = input.nextLine();
//		System.out.println("Thank you, " + cName + " please enter the total price of your item in dollars and cents: ");
//		double iPrice = input.nextDouble();
//		System.out.println("Sounds like a nice deal, let's make it even better. Enter the percentage of the discount that applies to your item: ");
//		int iDiscount = input.nextInt();
//	  double  discountPrice = iPrice - (iPrice* iDiscount / 100);
//	    
//	    
//	    
//	
//		iPrice = iPrice - iDiscount;
//		System.out.println("Awesome! Thank you, " + cName + " your total after discount is: " + discountPrice);
		
		
		/*                      EXAMPLE OF HOW ASSIGNMENT OPERATORS CAN SHORTEN LINES OF CODE
		 	int a = 2345; 
		a = a + 8;
		a = a / 3;
		a = 784 % 5;
		System.out.println(a);
		
		int b = 2345;
		b += 8;
		b /= 3;
		b %= 5;
		System.out.println(b);
		 * */
	 
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//		                                                   UNARY OPERATORS
		
		/*
		 * Increment - add 1 to the variable's value
		 * Decrement - subtract 1 from the variable's value
		 * */
		
		/*
		 * When we use unary operator, it will change the variable's value by 1 permanently.
		 * 
		 * */
		
		
		
		/*                                                ++ OPERATOR ADDS 1 TO THE VARIABLE
		 * int number = 100;
		 * number = number + 1;
		 * 
		 * number += 1;
		 * 
		 * ++number; // Will increase by 1 and then add to the variable
		 * ++number; 
		 * System.out.println(number); <-- WILL PRINT 104
		 * 
		 * */ 
		
		/*                                                -- OPERATOR TAKES 1 NUMBER AWAY FROM THE VARIABLE
		 * --number;
		 * --number;
		 * */
		/*
*	10	int apples = 10;
*	+1	++apples;
*	+1	apples++;
*		System.out.println(apples); <-- 12
*  The difference between ++apples and apples++ is what operation happens first.
*/		
//		
		/*                             Combine println() statements and unary operators             */
		 
//		int number = 10;
		
//		When we use ++ in front of the variable, the increment happens first and THEN print.
//      Using the ++ in front is an instant operation, ++ after variable is a promise that next use the variable will be +1.
//	    System.out.println(++number); 
		
//      When we use ++ after the variable, it will first print, then increment.
//		System.out.println(number++);
//      when we use ++ after the variable, it is a promise that value will be increased by 1. 
//      so next time we use the variable it will be +1.       
		
		
		// This will execute as 11   because Java sees number = 10, then it prints the increment + number, next it prints the number then increments. 11.
		//                      11

		
        // int num = 50;
        // println(++num); // 51
		// println(num--); // 51
		// println(num);   // promise is fulfilled 100%  --> 50
		// println(num);   // 50
		// println(--num) // 49
		
		
		// int a = 10;
//		System.out.println(++a + a++); // 11 + 11 = 22
//		System.out.println(a);         // 12 (because of the promise to increment)
		
		
       // int b = 20 
//		System.out.println(b++ + b++); // 20 + 21 = 41 (b was promised to increment, next time it was used it was increased to 21. 20 + 21 = 41 )
//		System.out.println(b++ + ++b); // 20 + 22 = 42 (b was promised, then instantly increased while also executing the promise. 20 + 22 = 42)
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		                                          /*      Task 9      */
		
//		int a = 10;
//		int b = 10;
		
//		System.out.println(a++ + ++a); // 10 + 12 = 22
		// a = 11
		// a = 12 (incremented 2 times)
//		System.out.println(a-- - --a); // 12 - 10 = 2
	    // a = 11
		// a = 10
		// final value = 2
//		System.out.println(b++ + b++); // 10 + 11 = 21
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		                                        /*  (!) - Negating an expression*/
//		boolean isCold = false;
//		System.out.println(isCold);
		// will print false
		
//		boolean isCold = false
//				System.out.println(!isCold);
		// will print true
		
//		boolean isEmpty = !true;
//		System.out.println(isEmpty);
		// will print false

		
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------		
                                                           /*(-) - Negate a number*/
//		int num = 100;
//		System.out.println(-num);
		// will print -100
		
		// PS. (+) - signals the number is positive -- don't need to use it generally. Java automatically makes numbers positive.
		
		
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
                                                         /*RELATIONAL OPERATORS*/
		// Relational operators are used to compare two values
		
		
		// (==) - Checks if two operands are equal (works with any primitive data type)
		
//		System.out.println(100 == 101); // will print "false" because == returns a boolean value
		
//		boolean isEqual = 25 == 25; // value of 25 == 25 will be assigned to isEqual (true)
//		System.out.println(isEqual); // will print "true"
		
		
		
		
		// (>) - checks if the left side is more than right side
//		System.out.println(90 > 91); // will print "false"
		
//		int a = 100;
//		boolean isMoreThan = a++ > 100; // 100 > 100 = false
//		System.out.println(isMoreThan); // will print false
		
		
		
		// (<) - checks if the left side is less than the right side
//		System.out.println(200 < 201); // true (200 is less than 201)
//		int num = a++;
//		boolean isLessThan = num < 102;
//		System.out.println(isLessThan); // true (the last ++ operator was a promise and wasn't executed yet. So a = 101 at the time of isLessThan
	
		
		

		
		
		
		
		
		
		

	}

}
