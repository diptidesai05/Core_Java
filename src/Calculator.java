import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int a, b, c;
		System.out.println("Enter two numbers ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Enter your choice ");
		c = s.nextInt();
		switch (c) {
		case 1:
			System.out.println(" Addition =" + (a + b));
			break;
		case 2:
			if (a > b) {
				System.out.println(" Subtraction =" + (a - b));
			} else {
				System.out.println(" Subtraction =" + (b - a));
			}
			break;

		case 3:
			System.out.println(" Multiplication =" + a * b);
			break;

		case 4:
			System.out.println(" Division =" + a / b);
			break;

		case 5:
			System.out.println(" Reminder =" + (a % b));
			break;
			
		default:
			 System.out.println("Not a valid operation");

		}
	}
}
