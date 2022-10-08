package module5.Lesson4;

public class Rectangle {

	// Instance variables
	double length;
	double width;
	
	
	// Methods
	double findArea() {
		return length * width;
	}
	
	void printInfo() {
		System.out.println("The length is: " + length);
		System.out.println("The width is: " + width); 
		System.out.println("The area is: " + findArea());
		
	}
	
	
}
