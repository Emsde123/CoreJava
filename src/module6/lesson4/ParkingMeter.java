package module6.lesson4;

public class ParkingMeter {

	
	int timeLeft = 0;
	int maxTime;
	
	// Constructor accepting a single integer parameter, whose value is used to initialize 
	// The maxTime instance variable.
	ParkingMeter(int maxTime){
		this.maxTime = maxTime;
	}
	
	
	
// This simulates us adding a quarter into the parking meter, if it's 25 then it will add 30 (minutes) to timeLeft.
// If a doesn't equal 25, then we don't increase timeLeft. It also won't increase if they're already at maxTime.
	public boolean add(int amount){
		
		boolean result = false;
		
		if(amount == 25 && (timeLeft + 30) <= maxTime) {
			timeLeft += 30;
			result = true;
		}
		return result;
//			return true;    <--- commented that out, added a boolean variable to avoid duplicate return statements.
//		}else {
//			return false;
//		}
	}
	
	// the tick() method is used to tick one (minute) off of timeLeft 
	public void tick() {
		if(timeLeft > 0) {
			timeLeft -= 1;
		}
			
		
	}
	
	
	// isExpired() checks if the time is up or not.
	// commented out my logic, we could accomplish
	// The same thing by returning weather timeLeft == 0;
	public boolean isExpired() {
		return timeLeft == 0;
//		boolean result = false;
//	if(timeLeft == 0) {
//		result = true;
//	}else {
//		System.out.println("Times up!");
//		result = false;
//	}
//	return result;
  }		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}