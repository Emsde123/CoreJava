package module6;

public class DemoMain {

	public static void main(String[] args) {
	
		
		// Print school info
		Student.printSchoolInfo();
		
		
		// Create an instance of Student class
		Student student1 = new Student();
		student1.firstName = "Daniel";
		student1.lastName = "Berry";
		
		System.out.println("Current email: " + student1.email);
		// Generate an email for student1
		student1.generateEmail(420);
		System.out.println("New email: " + student1.email);
		
		
		// Take credit 
		student1.takeCredit(15);
		System.out.println("Credits: " + student1.getNumberOfCredits());
	    System.out.println("Balance: " + student1.getBalance());
	    
		
		student1.takeCredit(100);
		System.out.println("Credits: " + student1.getNumberOfCredits());
	    System.out.println("Balance: " + student1.getBalance());
		
		student1.takeCredit(25);
		System.out.println("Credits: " + student1.getNumberOfCredits());
	    System.out.println("Balance: " + student1.getBalance());
		
		
		// Make a payment
	    // Less than 100
	    student1.makePayment(50.99);
	    
	    // Make a real payment
	    student1.makePayment(30000);
		
		System.out.println("Can the student graduate? " + student1.canGraduate());
		
		
		
		
		
		
		
	}

}
