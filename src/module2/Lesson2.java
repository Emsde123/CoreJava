package module2;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);	

		                             /*Arithmetic operators*/

             // (+) - Addition operator
////Add 2 variables with whole numbers
//System.out.println(10 + 20); // 30
//
//int myInt = 10;
//int myInt2 = 33;
//System.out.println(myInt + myInt2); // 43

//// Add 2 variables with whole numbers
//int a = 9;
//int b = 3;
//int sum = a + b;
//System.out.println(sum); // 12
		
// Any operation with 2 whole numbers will result to an int	
//int a = 1;
//int b = 2;             // WONT WORK DUE TO TRYING TO ADD AN INT TO A BYTE
//byte result = a + b;

//// Add 2 negative numbers
//int a1 = -90;
//int a2 = -30;
//int sum = a1 + a2;
//System.out.println(sum); // -120

//// Add 2 decimal numbers with doubles
//double myDouble = 10.5;
//double myDouble2 = 15.8;
//System.out.println(myDouble + myDouble2); // 26.3

// Strings interacting with operators
//System.out.println("The sum of the numbers is: " + 10 + 50); // This would be a concatenation. 1050.
//System.out.println(10 + 50 + " is the sum of the numbers 10 and 50"); // This would work due to 
// operator coming b4 string

//System.out.println("The sum of the numbers is: " + (10 + 50)); // This is a solution to the above prob.



                            //Char operators
//char myChar = 'A';
//char myChar2 = 'B';
//System.out.println(myChar + myChar2); // This will return 131 due to ACII values.
                                      // If you wanted to add a + b as a string look below.
//char myChar = 'A';
//char myChar2 = 'B';
//System.out.println("" + myChar + myChar2); // This will return AB, due to including "" 





                             // (-) Minus operator
//System.out.println(55 - 10); // 45
 
//int a = 66; 
//int b = 16;
//int sum = a - b;
//System.out.println(sum); // 50 

//double d1 = 55.90;
//double d2 = 40.90;
//double result = d1 - d2;
//System.out.println(result); // 15.0


//System.out.println(765 + 234);
//
//int a2 = 248;
//int b2 = 391;
//System.out.println(a2 + b2);
//
//double a3 = 129.44;
//int b3 = 94;
//int c3 = 82;
//System.out.println((a3 + b3) - c3);



                        // (*) Multiplication operator
//                       System.out.println(10 * 5);
//      int num = 100;
//      int num2 = 2;  
//      int sum = num * num2; // 200

//double d1 = 10.5;
//double d2 = 5.5;
////double result = d1 * d2;
////System.out.println(result);
//
//int intNum = 20;
//System.out.println(d1 * intNum); // 210.0 (double)



                       // (/) Division operator

//System.out.println(10 / 5); //2
//
//int num = 100;
//int num2 = 50;
//int result = num / num2;
//System.out.println(result); // 2

//System.out.println(10 / 3); // If I solve this it will only give me 3. You need to add a decimal.
//System.out.println(10 / 3.0); // This will return the right value of 3.33333333335                       


                // Task 3
//System.out.println(25 * -4);
//int var = 400;
//int var2 = 25;
//System.out.println(var * var2);
//System.out.println(var / var2);
//
//double var3 = 120.25;
//int var4 = 4;
//int var5 = 65;
//System.out.println(var3 * var4 / var5);



    // (%) - Modulo operator (or remainder operator)


//System.out.println(100 % 30); // 10

// does 30 fit into 100? --> Yes
// does 30 fit into 100 two times? ---> Yes
// does 30 fit into 100 three times? ---> Yes
// does 30 fit into 100 four times? --> No

// 30 three times will be 90
// 100 - 90 = 10 <--- Remainder

//System.out.println(17 % 5); // 2 
// 5 goes into 17 3 times and there's a remainder of 2.


//int minutes = 267;
//int hours = minutes/60;
//int minutesLeft = minutes%60;
//
//System.out.println(hours + "Hours.");
//System.out.println(minutesLeft + "Minutes");



//System.out.println("Is odd: " + (5 % 2)); // Is odd: 1
//System.out.println("Is odd: " + (6 % 2)); // Is odd: 0

//System.out.println(127 % 5); //2
//System.out.println(-171 % 8); //-3
 


                               // PEMDAS
//System.out.println(3 + 4 * 2); // 11 (multiplication first) 1. 4 * 2 = 8 
//                                                            2. 3 + 8 = 11

//System.out.println((3 + 4) * 2); // 14 (Parenthesis) 1. 3 + 4 = 7
//                                                     2. 7 * 2 = 14





                                // TASK 4

//System.out.println("Hello! Please enter your name below: ");
//String cName = input.nextLine();
//System.out.println("Thank you, " + cName);
//System.out.println("How many pounds did your shipment come out to? ");
//double shipWeight = input.nextDouble();
//double shipCost = shipWeight * 4.50;
//System.out.print("Thank you " + cName);
//System.out.println(" for shopping at Fedex. You're total today is: $" + shipCost);

                            // ROUND UP DECIMAL NUMBERS
//double number = 12345.6789; 
//System.out.println("Number " + number);
//
//long roundedNumber = Math.round(number);
//System.out.println("Rounded number: " + roundedNumber );


// the above lines will round up the double number to 12346
// when we round up a number and we have last digit as 5 
// the previous number will be increased by 
// 12345.5 -> 12346


// When we have a decimal number that was increased from less number
// to 5 java will not increase the previous one
// Example: 12345.49 -> 12345

//double number2 = 456.99;
//double roundedNumber2 = Math.round(number2);
//System.out.println(roundedNumber2);


//double number = 100.4565;
//double roundedNumber = Math.round(number * 10.0) / 10.0; // <--- EQUATION TO HAVE ONE DECIMAL NUMBER 
//System.out.println(roundedNumber);
//
//double roundedNumberTwoDecimals = Math.round(number * 100.0) / 100.0; 
//// IF YOU WANT ONE DECIMAL YOU DO WITH 10 IF YOU WANT TWO YOU DO IT WITH 100 ETC 
//System.out.println(roundedNumberTwoDecimals);
//
//double roundedNumberThreeDecimals = Math.round(number * 1000.0) / 1000.0; // <-- THREE DECIMAL POINTS
//System.out.println(roundedNumberThreeDecimals);

//System.out.println("Welcome. Please enter a decimal number: ");
//double dNum = input.nextDouble();
//double roundedDNum = Math.round(dNum * 100.0) / 100.0;
//System.out.println("Your number is rounded as: " + roundedDNum);


                                 // EXPRESSIONS AND STATEMENTS
System.out.println(5 + 10);
// 5 + 10 -> this expression evaluates to a single value(data type) int = 15
// expression basically means something that will eventually hit a single value.

// The expression can not be stand alone executed by Java.
// EXAMPLE 10 + 5 would not do anything alone in Java.
//int num;
//double wTemp = 7 
// num = 10 + 90                                 -is an expression.
// num = 10 + 90;                                - is a statement
// Math.round(num)                               - expression
// Math.round(num);                              - statement
// System.out.println("Hello")                   - expression
// System.out.println("Hello")                   - statement
int num2; //                                     - declaration statement
num2 = 100; //                                   - initialization or assignment statement
// Math.round(100.8976);                         - Method call statement
// A statement consists of expressions





	}

}
