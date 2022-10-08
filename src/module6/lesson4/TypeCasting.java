package module6.lesson4;

public class TypeCasting {

	public static void main(String[] args) {
		
		// 															WIDENING CASTING (automatic)
		// We convert a smaller data type to a larger one.
		// Type casting is assigning a value of one primitive data type to another type.
		
		
		// This process happens automatically because there is no data loss
		
		// declare an integer type variable
		int number = 100;
		
		System.out.println("The integer value: " + number); // 100
		
		// convert it to a double type variable
		// no data is lost, because we converted from a smaller data type to a larger data type
		// If you converted a double to an integer, you would lose the decimal points. Losing data.
		double dNumber = number; // the conversion happens automatically
		System.out.println("The double value: " + dNumber); // 100.0
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------		
		// 														NARROWING CASTING (manual)
		// We convert a larger data type to a smaller one. (not used very much, due to data loss)
		double myDouble = 10.334; 
		System.out.println("My double value: " + myDouble); // 10.334
		
		// narrowing is not automatic, because you can lose data like that. You have to manually add casting.
		//                        int myInt = myDouble;  <-- throws error asking to add casting.
			int myInt = (int)myDouble;
			System.out.println("My integer value: " + myInt); // 10
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------	
		// WEIRD BEHAVIOR WHEN CONVERTING INT TO BYTE	
		// The result below has to do with binary code, the results are strange.
		int myNum = 27131982; 
		byte myByte = (byte)myNum;
		System.out.println(myByte);  // 78 
//---------------------------------------------------------------------------------------------------------------------------------------------------------			
		
		
		
		
		
		
		
		
		

	}

	// This is also casting
	public double sum(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
}
