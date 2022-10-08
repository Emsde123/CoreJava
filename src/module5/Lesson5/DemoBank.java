package module5.Lesson5;

import java.util.Scanner;

public class DemoBank {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		// WE WILL IMPROVE WHAT IS BELOW, RE WRITING IT BETTER
		
//		WellsFargoBankAccount madisonBranch = new WellsFargoBankAccount();
////		madisonBranch.balance = 190000.0282456;
////		
////		madisonBranch.displayBalance();
////		
////		madisonBranch.deposit(1240);
//		
//		
//		// Open an account
//		madisonBranch.createAccount("Daniel Berry", "102287322", 500.00, "Basic");
//		
//		/* Add a deposit */
//		System.out.println("Enter deposit amount: ");
//		madisonBranch.deposit(scan.nextDouble());
//		
//		
//		/* Make a withdraw */
//		System.out.println("How much would you like to withdraw?");
//		madisonBranch.withdraw(scan.nextDouble());
//
//		/*Show new balance*/
//		madisonBranch.displayBalance();
		
		Scanner input = new Scanner(System.in);
		WellsFargoBankAccount salemBranch = new WellsFargoBankAccount();
//		String answerYesNo;
//		
//		System.out.println("Let's open an account for you");
//		System.out.println("Enter the account type");
//		String userAccountType = input.nextLine();
//		System.out.println("Enter your full name: ");
//		String fullName = input.nextLine();
//		System.out.println("Thank you, " + fullName + "Enter your initial deposit: ");
		
		
	//	do {
//		
//		System.out.println("Welcome to " + WellsFargoBankAccount.BANK_NAME);
//		System.out.println("Choose the option you want to perform: ");
//		System.out.println("1. Display Account");
//		System.out.println("2. Make a deposit");
//		System.out.println("3. Withdraw");
//		System.out.println("4. Display balance");
//		
//		
//		int userAnswer = input.nextInt();
//		
//		switch (userAnswer) {
//		case 1: 
//			salemBranch.displayAccount();
//			break;
//		case 2: 
//			System.out.println("How much do you want to deposit?");
//			salemBranch.deposit(input.nextDouble());
//			break;
//		case 3:
//			System.out.println("How much do you want to withdraw?");
//			salemBranch.withdraw(input.nextDouble());
//			break;
//		case 4: 
//			salemBranch.displayBalance();
//			break;
//		}
//	//	}while();
		
		
		
		

		salemBranch.createAccount("Daniel Berry", "452487422",5000, "checking");
		salemBranch.spend(1500);
		salemBranch.displayBalance();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
