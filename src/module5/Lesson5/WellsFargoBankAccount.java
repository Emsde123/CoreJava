package module5.Lesson5;

public class WellsFargoBankAccount {

	// Format method
    // System.out.format("%.2f",balance); this will round the number with 2 decimal points
	// System.out.format("$%,.2f",balance); This one adds a $ sign and a comma
	// It's used to print a value in a specific way, not when we want to work with the end result.
					
				/*State of the Bank Object*/
			public	static final String BANK_NAME = "Wells Fargo";
			public static final String BANK_POLICY = "Terms & Conditions apply";
			public	String accountType; 
			public	String accountNumber;
			public	String accountHolder;
			public	double balance;
			
				/*Behavior described by methods*/
			public static void displayPolicy() {
				System.out.println("Bank name: " + BANK_NAME);
				System.out.println("Bank policy:" + BANK_POLICY);
			}
			
			
			
			
			
			public void displayBalance() {
				System.out.print("Your current balance is: ");
				System.out.format("$%,.2f",balance);
				System.out.println();
				
			}
			
			/* Withdraw */
	
			public void withdraw(double withdraw) {
				
				if(balance < withdraw) {
					System.out.println("Insufficient funds.");
				}else {
		
					balance -= withdraw;
					System.out.println("You have withdrawn $" + withdraw );
				    System.out.println("Your new balance is: ");
				    System.out.format("%,.2f", balance);
				}	
			}
	
			/*Deposit*/
		public void deposit(double deposit) {
			balance += deposit;
			System.out.println("You have deposited $" + deposit);
			System.out.print("Your new balance is: $");
			System.out.format("%,.2f", balance);
			System.out.println();
		}
			
			
		// This method takes initial values for the account fields,
		// All these values we will assign to the instance attributes
		public void createAccount(String fullName, String userAccountNumber, double initBalance, String userAccountType) {
	
			accountType = userAccountType; 
			accountNumber = userAccountNumber;
			accountHolder = fullName;
			balance = initBalance;
			System.out.println("Account successfully created");
			
			
		}
		
		
		public void displayAccount() {
			displayPolicy();
			System.out.println("Account holder: " + accountHolder);
			System.out.println("Account number: " + accountNumber);
			System.out.println("Account type: " + accountType);
			displayBalance();
		}
		
		
		public double spend(double moneySpent) {
			
			if(moneySpent <= balance) {
				balance -= moneySpent;
				if(accountType.equalsIgnoreCase("checking")) {
					balance += (moneySpent * 5) / 100;
				}
 
			}else {
				System.out.println("Insufficient funds.");
			}
			
			return balance;
		}
		
		
		
	
	
}
