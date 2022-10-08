package module6.lesson4;

import java.util.ArrayList;
import java.util.Arrays;

import module6.Lesson3.Employees;

public class ArrayListPractice {

	public static void main(String[] args) {

		// all of the below objects can be stored in an array
		Employees daniel = new Employees(2453, "Daniel", "Full-time", 120000);
		Employees shabnam = new Employees(2465, "Shabnam", "Full-time", 150000);
		Employees aziz = new Employees(2464, "Aziz", "Part-time", 130000);
		Employees nasimi = new Employees(2473, "Nasimi", "Contract", 100000);
		Employees malak = new Employees(2433, "Malak", "Part-time", 110000);
		Employees omer = new Employees(2432, "Omer", "Contract", 30000);
		
		// creating the array that we can populate with objects
		Employees [] employees = {daniel, shabnam, aziz, nasimi, malak};
		
		// NOT POSSIBLE because index 5 does not exist, arrays are fixed length.
		// employees[5] = omer;
		
		
		System.out.println(employees[2].salary); // returns Aziz salary
		System.out.println(employees[4].status); // returns Malak status
		
//-----------------------------------------------------------------------------------------------------------------------------------------		
		// CHECK IF ARRAY CONTAINS THE NAME DANIEL
		boolean hasDaniel = false;
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].name.equalsIgnoreCase("daniel")) {
				hasDaniel = true;
				break;
			}
		}
		
		System.out.println("The array has an object named daniel " + hasDaniel ); // true
//-----------------------------------------------------------------------------------------------------------------------------------------
	    // IDENTIFY THE INDEX OF OBJECT WITH THE NAME "DANIEL"
		
		int index = 0;
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].name.equalsIgnoreCase("Daniel")) {
				index = i;
				break;
			}
		}
		System.out.println("The object with the name \" Daniel\" is located at index: " + index ); // index 0
//-----------------------------------------------------------------------------------------------------------------------------------------		
//												ACCOMPLISH THE SAME THINGS USING ARRAY LISTS

		// How we define an ArrayList<>?
		// ArrayList<String> cities = new ArrayList<>();
		// ArrayList - type of data structure
		// <> angle brackets(diamond brackets) - Generics - specifies the data type we will be using for the elements of array.
		// cities - name/reference name of the ArrayList - will become an object created in heap memory
		// new - instantiates a new object
		// ArrayList<>() - constructor of the object
		
		// Notes: 
		// 1. We can not use primitive data types for the type of element
		// 		example: ArrayList<int> nums = new ArrayList<>(); <--- THROWS SYNTAX ERROR (must wrap int into Integer if you want it to work)
		
		// 2. We can provide a size either in the constructor or the values itself.		
		// 3. By default, ArrayList has a capacity of 10 - means it has 10 cells
		//	  capacity is how many cells we have available in the list.
		
		ArrayList<String> cities = new ArrayList<>(5); // <-- don't usually need to specify the capacity of lists, because they dynamically grow as you add things.
		
		// add elements to list/populate the list - .add(object o)
		
		cities.add("Miami");
		cities.add("Salem");
		cities.add("Chicago");
		cities.add("Seattle");
		cities.add("Portland");
		cities.add(4, "Miami");
		
		// print the content of a list
		
		System.out.println(cities);
		cities.add(0, "Harrisburg"); // adds the element to the specified index - add(index, Object o)
		System.out.println(cities);
		
		// get the size() of the list - .size()    <-- Similar to length, capacity is the max amount of elements, size is the amount of elements.
		// even though we assigned the capacity to 5 at line 72, we can increase the size because it's an ArrayList. Dynamic.
		
		// remove an object from the list - remove(Object o)
		// removes the first occurance of the object.
		cities.remove("Miami");
		System.out.println(cities);
		
		// remove an object from the list by index - remove(index)
		cities.remove(0);
		System.out.println(cities);
		
		// check if the list contains an object
		System.out.println("Salem present in list " + cities.contains("Salem"));
		System.out.println("Miami present in list " + cities.contains("Miami"));
		
		// access an element from the list - get(index)
		System.out.println(cities.get(2)); // Seattle

		
		// check if the list is empty
		System.out.println(cities.isEmpty());		
		ArrayList<Integer> nums = new ArrayList<>();		
		System.out.println(nums.isEmpty()); // true
		
		
		// get the index of a specific object - indexOf()
		System.out.println(cities.indexOf("Salem"));      // 0
		System.out.println(cities.indexOf("Harrisburg")); // -1
		
		
		// get the last index of a specific object - lastIndexOf()
		System.out.println(cities.lastIndexOf("Miami")); // 3
		
		
		// modify the value of an element - set(index, Object new)
		cities.set(3, "Fort Lauderdale");
		System.out.println(cities); // [Salem, Chicago, Seattle, Fort Lauderdale, Portland]
		
		
		// We can create an array list by providing values directly to the constructor.
		ArrayList<String> europeCities = new ArrayList<>(Arrays.asList("Adana", "Antolia", "Izmir", "Istanbul", "Van", "Ankara" ));
		System.out.println(europeCities);
		
		// merge another list
		cities.addAll(europeCities);
		System.out.println(cities); // [Salem, Chicago, Seattle, Fort Lauderdale, Portland, Adana, Antolia, Izmir, Istanbul, Van, Ankara]
		
		
		// merge in a specific place
		ArrayList<String> southAmerica = new ArrayList<>(Arrays.asList("Rio", "Bogota", "Lima"));
		cities.addAll(2, southAmerica); // Places the arrayList into the 2nd index of cities
		System.out.println(cities); 
		// [Salem, Chicago, Rio, Bogota, Lima, Seattle, Fort Lauderdale, Portland, Adana, Antolia, Izmir, Istanbul, Van, Ankara]
	}

}
