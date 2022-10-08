package module6.Lesson3;

public class Hotel {

	int numberOfApartments;
	int numberOfStars;
	String name;
	boolean hasPool;
	
	
	
    public Hotel(String name, int numberOfApartments, int numberOfStars, boolean hasPool){
		this.name = name;
		this.numberOfApartments = numberOfApartments;
		this.numberOfStars = numberOfStars;
		this.hasPool = hasPool;
	}
	
	
	public Hotel(){
		
	}
	
	
	
	
	
	
	public void printInfo() {
		System.out.println("-----------------------------------------");
		System.out.println("The number of rooms is: " + numberOfApartments);
		System.out.println("The number of stars is: " + numberOfStars);
		System.out.println("The name of the hotel is: " + name);
		System.out.println("Does the hotel have a pool?:  " + hasPool);
		System.out.println("-----------------------------------------");
		
	}
	
	// Even if we use the class name, it will be treated as a method as long as we have a return type.
	public int Hotel(int numberOfApartments) {
		return this.numberOfApartments --; 
	}
	
	
	
}
