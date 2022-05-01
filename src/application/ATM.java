package application;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	private static Scanner in = new Scanner(System.in);
	private ArrayList<Account> accountList = new ArrayList<Account>();
	public static void main(String[] args) {
		// Create and initialize list of accounts


		// Add 3 accounts
		Account one = new Account(101, "Georg Feil");
		Account two = new Account(102, "Harrison Ford");
		Account three = new Account(103, "Raveena Tandon");

		one.setAnnualInterestRate(5);
		two.setAnnualInterestRate(5);
		three.setAnnualInterestRate(5);

		one.setBalance(50);
		two.setBalance(1000);   // Third account will default to balance 0

		accountList.add(one);
		accountList.add(two);
		accountList.add(three);

		// Prompt for account number and call the menu method in an endless loop
		while (true) {
			System.out.print("\nPlease enter your account number: ");
			int num = in.nextInt();  // TODO: Add exception handling

			// Check for valid account number
			boolean found = false;
			for (int index = 0; index < accountList.size(); index++) {
				Account acc = accountList.get(index);
				if (num == acc.getId() ) {
					found = true;
					menu(acc);      // Display menu and process transactions
					break;
				}
			}

			if (!found) {
				System.out.println("Invalid account number, please try again.");
			}

		}
	}  // End of main method

	// Display menu and process transactions.
	// It's ok to make this method static since it does not need to access any fields.
	public static void menu(Account acct) {
		while (true) {  // Loop until break
			// Print menu
			System.out.println("\n1: Account info");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");

			System.out.print("Please choose: ");
			int choice = in.nextInt();  // TODO: Add exception handling
			switch (choice) {
			case 1:
				System.out.println("Customer: " + acct.getCustomerName());
				System.out.printf("Account balance: %.2f\n", acct.getBalance());
				System.out.printf("Monthly interest earned: %.2f\n", acct.monthlyInterest());
				System.out.println("Account creation date: " + acct.getDate());
				break;
			case 2:   // Withdraw
				System.out.print("Please enter amount to withdraw: ");
				double amount = in.nextDouble();
				acct.withdraw(amount);
				break;
			case 3:   // Deposit
				System.out.print("Please enter amount to deposit: ");
				double amount2 = in.nextDouble();
				acct.deposit(amount2);
				break;
			case 4:   // Exit
				System.out.println("Logging off");
				break;
			default:
				System.out.println("Invalid option, please try again");
			}   // End of switch

			// Second break needed because first break gets out of switch, not the loop.
			// Could also use "break with label" syntax.
			if (choice == 4) {
				break;
			}
		}    // End of loop
	}   // End of menu method

	public void  load()
	{

	}
}

