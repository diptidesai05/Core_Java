import java.util.Scanner;

public class Method {

	
	
	public static void main(String[] args) {
		int a, b, c, r;
		System.out.println("Enter two numbers ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Enter your choice ");
		c = s.nextInt();
		r=calculate( a, b, c);
		System.out.println(" Result = "+r);
		
	}

	public static int calculate(int a, int b, int c) {
        int r =0; 
		switch (c) {
		case 1:
			System.out.println(" Addition");
			r = a + b;
			break;
			
		case 2:
			if (a > b) {
				System.out.println(" Subtraction ");
				r = a - b;
			} else {
				System.out.println(" Subtraction ");
				r = b - a;
			}
			break;

		case 3:
			System.out.println(" Multiplication ");
			r = a * b;
			break;
		case 4:
			System.out.println(" Division ");
			r = a / b;
			break;

		case 5:
			System.out.println(" Reminder ");
			r = a % b;
			break;
			
		default:
			 System.out.println("Not a valid operation");

		}
		return r;
	}
}
