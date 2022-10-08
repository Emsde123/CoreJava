package module6.lesson4;

public class DemoParkingMeter {

	public static void main(String[] args) throws InterruptedException {


		ParkingMeter metroPark = new ParkingMeter(60);
	System.out.println(metroPark.add(25));	
		
		
		
		System.out.println(metroPark.timeLeft);
		metroPark.add(25);
		System.out.println(metroPark.timeLeft);
		
		metroPark.tick();
		
		System.out.println(metroPark.timeLeft);
		metroPark.add(25);
		System.out.println(metroPark.timeLeft);
		
		System.out.println(metroPark.isExpired());
		
		// checks if isExpired is not expired
		// Thread.sleep() allows us to tick in real time.
		while(!metroPark.isExpired()) {
			System.out.print(".");
			metroPark.tick();
			Thread.sleep(500);
			
		}
		
		System.out.println(metroPark.isExpired());
		
		
		
		
		
		
	}

}
