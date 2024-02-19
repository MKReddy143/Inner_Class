package Inner_class;

public class Static_Inner_Class {
	private String Bank_Name;

	public Static_Inner_Class(String name) {
		this.Bank_Name = name;
	}

	static class Account {
		private String accountNumber;
		private double balance;

		public Account(String accountNumber) {
			this.accountNumber = accountNumber;
			this.balance = 0.0;
		}

		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposite " + amount + " into account " + accountNumber);
		}

		public void withdraw(double amount) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawn  " + amount + " from account " + accountNumber);
			} else {
				System.out.println("Insufficient balance in account " + accountNumber);
			}
		}

		public void checkBalance() {
			System.out.println("Account " + accountNumber + " balance:  " + balance);
		}
	}

	public static void main(String[] args) {
		Static_Inner_Class Bank = new Static_Inner_Class("UBI");

		Static_Inner_Class.Account account1 = new Static_Inner_Class.Account("100000");
		account1.deposit(500);
		account1.withdraw(1000);
		account1.checkBalance();
	}

}
