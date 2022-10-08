package module5.Lesson4;

public class House {

		
		int numberOfWindows;
		int numberOfRooms;
		int numberOfStories;
		String address;
		int yearBuilt;
		boolean hastartool;
		boolean hastartatio;
		
		void printInfo() {
			System.out.println("--------------------------------------------------");
			System.out.println("The number of windows: " + numberOfWindows);
			System.out.println("The number of rooms: " + numberOfRooms);
			System.out.println("The number of stories: " + numberOfStories);
			System.out.println("Address: " + address);
			System.out.println("House was built in: " + yearBuilt);
			if(hastartool) {
				System.out.println("The house has a pool");
			}else {
				System.out.println("There's currently no pool at the house");
			}if(hastartatio) {
				System.out.println("There is a nice patio");
			}else {
				System.out.println("The house does not have a patio");
			}
			System.out.println("--------------------------------------------------");	
		}
		

	}
	

