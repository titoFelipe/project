import java.util.*;

public class BankInterActive {
	
	private Bank b;
	private Scanner sc = null;
	
	public BankInterActive() {
		b = new Bank("The boss");
		sc  = new Scanner(System.in);
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void handleRequest(int input) {

		if(input == 1) {
			print("How much would you like to deposit?");
			double amt = sc.nextDouble();
			
			b.deposit(amt);	
			ask();
		} 					
		
		if(input == 2) {
			print("How much would you like to withdraw?");
			double amt = sc.nextDouble();
			
			if(amt > b.getBalance()) {
				print("Insufficient funds my poor friend\n");
				ask();
			} else if (amt < b.getBalance()) {
				b.withDraw(amt);
				ask();
			}
		} 
		
		if(input == 3) {
			print("Your balance is: " + b.getBalance());
			ask();
		}
		
		if(input == 4) {
			print("Goodbye");
			sc.close();
			return;
		}
	}
	
	public int ask() {
		print("What would you like to do?");
		print("1 = deposit\n2 = withdraw\n3 = See my balance\n4 = Exit");
		int answer = sc.nextInt();
		
		handleRequest(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInterActive bi = new BankInterActive();
		
		Scanner sc = new Scanner(System.in);
		bi.print("Hello, please type your name to verify...");
		
		String name = sc.next();
		
		bi.print("Hello: " + name + "\n");

		bi.ask();
		sc.close();
	}

}
