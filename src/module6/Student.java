package module6;

public class Student {

	// CLASS VARIABLES - STATIC
	public static int minGraduateCredit = 120;
    public static final String SCHOOL_NAME = "Yoll Academy";
	public static final String EMAIL_DOMAIN = "@yoll.io";
    public static double tuitionPerCredit = 200.00;
	
    // Instance variables
	String firstName;
	String lastName;
	String email;
	
	// Three private variables, if you see "getter" and "setter" as a requirement then it's a private variable/method.
	private long phoneNumber;
	private double balance;
	private int numberOfCredits;
	
	
	
	
	
	
	
	
	// Getters and Setters (automatically created by hovering over the variable and clicking "create getter and setter"
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	// ---------------------------------------------------------------------------------------------------------------------------
	
	// Method that displays school name, tuition fee per credit, and min credits for graduation
	public static void printSchoolInfo() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The school name is: " + SCHOOL_NAME);
		System.out.println("Tuition fee per credit is: $" + tuitionPerCredit);
		System.out.println("Minimum credits required to graduate: " + minGraduateCredit);
		System.out.println("-----------------------------------------------------------------");
		
	}
	
	// Method that generates email from the name of student, added a new String to allow for toLowerCase.
	public void generateEmail(int num) {
		String generatedEmail = firstName + "." + lastName + num + EMAIL_DOMAIN;
		email = generatedEmail.toLowerCase();
		System.out.println("Your email has been created. New email: " + email);
		
	}
	
	
	// Method to update existing balance
	private void updateBalance(double updateAmount, String updateType) {
		if(updateType.equalsIgnoreCase("increase")) {
			balance += updateAmount;
		}else if(updateType.equalsIgnoreCase("decrease")) {
			balance -= updateAmount;
		}}
		
		
		// Should accept number of credits as a parameter and increase the students credits
		// Should also call on updateBalance() mathod and increase users balance based on how many credits were taken.
		public void takeCredit(int numberOfCredits) {
			this.numberOfCredits += numberOfCredits;
			// calculate the amount
			double cost = numberOfCredits * tuitionPerCredit;
			updateBalance(cost, "increase");
		}
		
		
		
		// Should check if student has enough credits to graduate and has $0 balance. Should return a boolean
		public boolean canGraduate() {
			if(numberOfCredits >= minGraduateCredit && balance <= 0) {
			return true;	
		}else {
			return false;
		}
		}
			
			
		// Should accept payment amount, checks if it's atleast $100.00. If so then it decreases the balance. If not, then print "Sorry, min payment is $100.00"
			public void makePayment(double payment) {
				if(payment >= 100.00) {
					updateBalance(payment, "decrease");
					System.out.println("Thank you for your payment. Your new balance is: " + balance);
			}else {
				System.out.println("Sorry, minimum payment is $100.00");
				
				
			}
		
		
	}
	
	
	
	
	
	
	
	






}






