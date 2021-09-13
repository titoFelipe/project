
public class Bank {
	
	private double balance = 0;
	private String name;
	
	public Bank (String name) {
		this.name = name;
	}
	
	public double getBalance() {		
		print("Your balance: " + balance + "\n");
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(double amt) {
		print("You deposited: " + amt);
		balance += amt;
	}
		
	public void withDraw(double amt) {
		if(amt > balance) {
			print("You can't withdraw: " + amt + ", your balance is only: " + getBalance());
			return;
		}
		print("You withdrew: " + amt);
		balance -= amt;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("James");		
		bank.print("Hello: " + bank.getName());
		//bank.print("Your balance: " + bank.getBalance() + "\n");
		
		bank.deposit(20);
		bank.deposit(10);
		
		bank.getBalance();
		
		bank.withDraw(12);
		
		bank.getBalance();
		bank.withDraw(100);
		
		bank.getBalance();
	}

}
