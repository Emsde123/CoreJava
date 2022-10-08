package module5.Lesson4;

public class DebuggingPractice {

	public static void main(String[] args) {
		

	
//		int sum = 0;
//		
//		for (int i = 0; i <= 5; i++) {
//			
//			sum += i;
//		}
//		System.out.println("The sum is: " + sum);
		
		// Method calls
		// To debug a method use the step into button instead of stend over.
		// Once inside the method you go back to stend over.
		int addition = addNums(17, 23);
		
		// Do not step into predefined methods. No need.
		System.out.println(addition);
		
		
	}

	public static int addNums(int a, int b) {
		int result = a + b;
		return result;
	}
	
	
	
}
