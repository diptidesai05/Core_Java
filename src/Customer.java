import java.util.Scanner;

abstract class Bank {

	public String bankName = "HDFC";
	public String IFSC = "HDFC001";

	abstract void deposit();

}

class BankService extends Bank {

	private double balance = 1000;
	private double money;

	@Override
	void deposit() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		money = s.nextDouble();
		s.close();
		balance = balance + money;
		System.out.println("Total balance " + balance);
	}
}

public class Customer {

	public static void main(String args[]) {
		BankService bs = new BankService();
		bs.deposit();
	}
}