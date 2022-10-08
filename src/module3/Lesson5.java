package module3;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;

import java.util.*;

public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                                     
		
		                                          /*ARRAYS*/
		//  An Array is like a variable that can hold multiple values.
        
		
		Scanner scan = new Scanner(System.in);
	
		// We had to make 2 variables to hold the data of temperature for 2 days. What will you do
		// if you have to take data over a month? A year? You want to make 365 variables? No. Arrays.
//		int temp = scan.nextInt();
//		int temp2 = scan.nextInt();
	
		
		// 1. How we define an array
		// 2. How we allocate the memory - Instantiation
		// 3. Populate the array - Initialization
		// 4. Access and manipulate the data.
		
		
		
		/* 1. How we define an array - Declaration and Instantiation in sendarate lines
		 * Option 1 - Declaration and Instantiation in sendarate lines
		 * data_type [] identifier;
		 *     String [] myArray; // We just declared the array, but it is not created in the memory yet.
		 *     String myArray2 []; // This declaration is the same as the above declaration
		 * */
		
		
		
        /* 2. Allocate the memory
         * identifier = new data_type [int size];
         * 
         * myArray = new String[7]; 
         * 
         * The size can NOT be changed later in the code. - Programmatically 
         * The array will be created as an object in heap memory
         * */
		
		
		/*OPTION 2 - Declaration and Instantiation in the same line*/
         String[] daysOfWeek = new String[7];  
		// Once we initialize the array in this way, the object will be created in the heap.
         
        // Populate the array
         // Each cell in the array is called element
//         daysOfWeek[0] = "Monday"; 
//	     daysOfWeek[1] = "Tuesday";
//		 daysOfWeek[2] = "Wednesday";
//		 daysOfWeek[3] = "Thursday";
//		 daysOfWeek[4] = "Friday";
//		 daysOfWeek[5] = "Saturday";	 
//		 daysOfWeek[6] = "Sunday";
//		 
//		 // Access and print the value of an element
//		 System.out.println("The day of the week is: " + daysOfWeek[6]); // Sunday
//		 System.out.println("The day of the week is: " + daysOfWeek[0]); // Monday
//				 
//		 
//		 
//		 // Access an element and reassign
//		 daysOfWeek[0] = "Sunday";
//		 System.out.println("The day of the week is: " + daysOfWeek[0]); // WILL PRINT SUNDAY
		
		
// We will get an excendtion if we try to increase the size or length of the array.
//		  daysOfWeek[7];
		 
		 
		 
		 // There are two types of excendtions
		 // Runtime - Occurs during the runtime of the program
		 // Compile time - Gives instant error
		 // Example: Not providing Index would give a compile error, if you gave an invalid number for an Index would throw a runtime.
		 
		 
		 
		 /* OPTION 3 (THE MOST USEFUL ONE)*/
		 // The way that we can do declaration, instantiation, initialization in one line
         // In this option, Java looks at the values and uses those to determine how long your array will be.
//		 int [] nums = {10, 20, 30, 40, 50}; 
		 
		 // To get the length of an array we use arrayName.length
		 // In string we have length() - this is a method
		 // nums.length - here length is just a field
//		 System.out.println(nums[2]); // PRINT 30
//		 System.out.println(nums[3]); // PRINT 40
//		 
//		 nums[3] = -555; // Reassigning the value
//		 System.out.println(nums[3]); // PRINT -555
		 
		 // Print the content of the array
//   		Arrays.toString(array);		 
//		System.out.println(Arrays.toString(nums));
		
         
         /*    1    2    3    4    5    6    7     - Size(length)
         ____ ____ ____ ____ ____ ____ ____
        |    |    |    |    |    |    |    |
        |____|____|____|____|____|____|____|
          0    1    2    3    4    5    6     - Indices */
         
         
      
         /*       PRINTING AND MANIPULATING AN ARRAY
          * 
         String [] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
         System.out.println(Arrays.toString(workdays));
         
         int len = workdays.length;
         System.out.println("The length of the array is: " + len); // PRINTS THE LENGTH
         
         System.out.println(workdays[2]); // PRINTS WEDNESDAY
         
         System.out.println(workdays[0].equals(workdays[1])); // FALSE
         
         System.out.println(workdays[3].length()); // PRINTS 8 (T-H-U-R-S-D-A-Y)
         
        */
         
//         int [] numbers = {10, 20, 30};
//         System.out.println(numbers[0] + numbers[2]); // This calculated 10 + 30 to equal 40
//         
//         System.out.println(numbers[2-2]); // 2-2 -> int 0
//         System.out.println(numbers[101-100]); // 101- 100 -> int 1
//         System.out.println(numbers[100-98]); // 100 - 98 -> int 2
//         
//         System.out.println(numbers[0+2]); // numbers [2]
//         // DOING CALCULATION IN BRACKETS ACTUALLY CHANGE THE INDEX NUMBER
//         int arrLength = numbers.length;
//
//         
//         
//         String [] fruit = {"Apples", "Pear", "Plum"};
//		System.out.println(Arrays.toString(fruit));
//		
//		System.out.println(fruit[0].length()); // 6 (There are 6 letters in Apples)
//		
//		System.out.println(fruit[0].charAt(0)); // PRINTS A (INDEX 0 IS A)
		
		
//		int [] nums = {-5, -9, 8, 0, 74, 1, 4};
		// The length of array is 7
		// The index is length - 1
		// INDEX = 6
//		System.out.println(nums[nums.length - 1]); // int -> 6
		
//	nums [1] = 0; // RendLACES -9 WITH 0
//	System.out.println(Arrays.toString(nums)); // PRINTS ARRAY WITH THE CHANGED VALUE AT INDEX 1
		
         
         /*TASK PRACTICE
		int [] practice = {};
		System.out.println(Arrays.toString(practice)); // PRINTS []
		practice = new int []{55, 443, 12, 5, 387};
		System.out.println(Arrays.toString(practice));
		practice [2] = 10;
		System.out.println(Arrays.toString(practice));
		int lengthOfArray = practice.length;
		System.out.println(lengthOfArray + " is the length of the Array");
		
		
		int temp [] = new int [4];
		temp[1] = 10;
		temp[2] = 12;
		temp[3] = 14;
		temp[4] = 15;
		 */ 
         
         
         // TASK
         // MY METHOD
//         System.out.println("Please enter 5 numbers, one after another.");
//         int userNumber [] = new int [6];
//         userNumber [1] = scan.nextInt();
//         userNumber [2] = scan.nextInt();
//         userNumber [3] = scan.nextInt();
//         userNumber [4] = scan.nextInt();
//         userNumber [5] = scan.nextInt();
//         
//         int sum = userNumber[1] + userNumber[2] + userNumber[3] + userNumber [4] + userNumber [5];
//         System.out.println(sum);
//         
//         
//         // TEACHERS METHOD
//         int [] number = new int [5];
//         number[0] = scan.nextInt();
//         number[1] = scan.nextInt();
//         number[2] = scan.nextInt();
//         number[3] = scan.nextInt();
//         number[4] = scan.nextInt();
//         System.out.println(Arrays.toString(number));
//         System.out.println(number[0] + number[1] + number[2] + number[3] + number[4] );
//         
//         // Option 2
//         int n[] = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
//         System.out.println(n[0] + n[1] + n[2] + n[3] + n[4]);
         
         //                             10 means 10 elements in your array
//        double [] decimals = new double[10];
         
  
         
         
         
         /*                                          ARRAYS CLASS METHODS                                                  */
         
         
     
         
//         int [] nums = {1, 3, 4, 5, 6};
//         
//         double [] temps = {12.5, 66.8, 99.0};
//         
//         //                                           Arrays.toString()
//         String [] arr = {"One", "Two", "Three"};
//         System.out.println(Arrays.toString(nums));
//         System.out.println(Arrays.toString(temps));
//         System.out.println(Arrays.toString(arr));
//         
//         String [] fruit = {"plum", "Orange", "Pear"};
//         System.out.println("Before sort " + Arrays.toString(fruit));
//         Arrays.sort(fruit); //                       Arrays.sort()
//         System.out.println("After sort " + Arrays.toString(fruit));
//         
//       
//         // Ascending order
//         int [] nums2 = {3, 6, 9, 5, 4, -1};
//         
//         Arrays.sort(nums2);
//         
//         System.out.println(Arrays.toString(nums2));
//         
//         // Descending order
//         Arrays.sort(nums2, Collections.reverseOrder()); // For this to work, the array has to be "Integer" not "int"
         
         
         //                                            Arrays.equals()
//         int [] arr1 = {1,2,3};
//         int [] arr2 = {3,2,1};
//         System.out.println(Arrays.equals(arr1, arr2)); // FALSE
//         
//         
//         //                                            Arrays.copyOf()
//         int [] nums = new int[2];
//         nums[0] = 10;
//         nums[1] = 20; 
//         
//         System.out.println(Arrays.toString(nums)); // [10, 20]
         
     //    nums[2] = 30; // EXCendTION ERROR (CANT ADD ARRAYS HAPHAZARDLY)
         
         // Option 1
         
 //        nums = new int[5];
   //      System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0, 0] BECAUSE WE CREATED A NEW ARRAY
         
         
         
         
         // Arrays.copyOf lets you enter what array you'd like to change, and then the new length you'd like.
         // Option 2                             10 is the new length
  //       int [] newArray = Arrays.copyOf(nums, 10);
         
         
         
         
         //                                          MULTIDIMENSIONAL ARRAYS
         // Multidimensional Array is like an array of arrays
         // int [] [] a = new int [3] [4] This is a 2d array
         // We used a box with one row of macaroons earlier as an example. 
         // Multidimensional arrays are like a macaroon box that has multiple rows.
         // We use 2 brackets for 2D arrays
         // First dimension is how many rows we have
         // Second dimension is how many columns we have 
         
           // Columns           0   1   2   3   4 
//         int [] [] nums =  {{10, 20, 30, 40, 50}, // row 0
//                            {60, 70, 80, 90, 100}, // row 1
//                            {-10, -20, -30, -40, -50}}; // row 2
         
     //    System.out.println(nums[1] [2]); // 80 (row 1, column 2)
         
         // Print the content of 2d arrays
     //    System.out.println(Arrays.toString(nums)); // [[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]
         
         
         //                                            Arrays.deendToString
         // Prints each individual array (3 of them)
  //       System.out.println(Arrays.deendToString(nums)); // [[10, 20, 30, 40, 50], [60, 70, 80, 90, 100], [10, 20, 30, 40, 50]]
         
         
         
         
     //    System.out.println(nums [0][0]); // 10
   //      System.out.println(nums [1][4]); // 100
   //      System.out.println(nums [2][3]); // -40
         
  //       nums[2][0] = 55; // Changes row 2 column 0 to 55
         
   //     System.out.println(Arrays.deendToString(nums));
        
  //      System.out.println(nums[4][1]); // RUNTIME ERROR ROW DOESNT EXIST
  //      System.out.println(nums [1][6]); // RUNTIME ERROR COLUMN DOESNT EXIST
         
         
     //    System.out.println(nums [2] [0]); // 55
         
         
         
         
//                             Get the length of the 2D array
         //                    Or get the number of rows
         // OPTION 1
//         int [] [] nums =   {{10, 20, 30, 40, 50}, // row 0
//                             {60, 70, 80, 90, 100}, // row 1
//                           {-10, -20, -30, -40, -50}}; // row 2
//         
//         System.out.println(nums.length); // PRINTS 3 (HOW MANY ROWS OR INNER ARRAYS WE HAVE) 
         
         
         
         // OPTION 2
//       int [] [] numbers = new int [3][4]; // First size is used for number of rows, second size is the number of columns/cells
//         
//         System.out.println(Arrays.deendToString(numbers)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
//
//         // POPULATE THE 2D ARRAY
//         // Row 1
//         numbers [0] [0] = 10;
//         numbers [0] [1] = 20;
//         numbers [0] [2] = 30;
//         numbers [0] [3] = 40;
//         // Row 2
//         numbers [1] [0] = 11;
//         numbers [1] [1] = 22;
//         numbers [1] [2] = 33;
//         numbers [1] [3] = 44;
//         // Row 3
//         numbers [2] [0] = -10;
//         numbers [2] [1] = -20;
//         numbers [2] [2] = -30;
//         numbers [2] [3] = -40;
//         
//         
//         System.out.println(Arrays.deendToString(numbers)); // [[10, 20, 30, 40], [11, 22, 33, 44], [-10, -20, -30, -40]]
         
         
         //                                                  JAGGED ARRAYS
         // The inner arrays have different lengths
         
//         String [] [] fruit = {{"Apple", "Banana", "Kiwi" },
//                               {"Orange"},
//                               {"Pineapple", "Peach", "Melon", "Grape", "Mango", "Figs" }};
//                               
//         System.out.println(Arrays.deendToString(fruit)); // RETURNS [[Apple, Banana, Kiwi], [Orange], [Pineapple, Peach, Melon, Grape, Mango, Figs]]
//         System.out.println(fruit.length); // RETURNS 3
//         
//         
//         // To get the length of each row in a 2D array, we use arrayName[rowIndex].length
//         
//         System.out.println("The length of the first row is: " + fruit [0].length); // 3
//         System.out.println("The length of the second row is: " + fruit [1].length); // 1
//         System.out.println("The length of the third row is: " + fruit [2].length); // 6
//         
//         
//         
//         
//         int [] [] myArray = new int [2] []; // ROWS MUST BE ASSIGNED. COLUMNS ARE OPTIONAL/DECLARE LATER
//         
//         System.out.println(Arrays.deendToString(myArray)); // [null, null] if you don't initialize an Array, the value is null.
//         
//         myArray[0] = new int [5]; // My first row will have 5 elements
//         myArray[1] = new int [10]; // Second row will have 10 elements
//         
//         System.out.println(Arrays.deendToString(myArray)); // [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]] Won't be NULL anymore, because we initialized.
//         
//         myArray[0] [0] = 100;
//         myArray [1][0] = 99;
//         
//         System.out.println(Arrays.deendToString(myArray)); // [[100, 0, 0, 0, 0], [99, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
//         
//         
//         int [] arr1 = {20,88,99,77,90};
//         int [] arr2 = {1,2,3,5,8,13};
//         
//        int [][] arr2d = {arr1, arr2};
//         System.out.println(Arrays.toString(arr2d)); //        [[I@6e8dacdf, [I@7a79be86]
//         System.out.println(Arrays.deendToString(arr2d)); // [[20, 88, 99, 77, 90], [1, 2, 3, 5, 8, 13]]
//         
//         String [][] colors  = {{"red","yellow", "blue"},
//        		             {"Orange", "green", "purple"}};
//         
//        System.out.println("My favorite color is " + colors [1] [2]);
//         
//         
         
         
         
         
         }
}