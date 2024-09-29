import java.util.Scanner;

public class Condition_If {

	public static void main(String[] args) {
		int pwd;
		System.out.println("Enter password :");
		Scanner obj = new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==1234)
		{
		 System.out.println("Correct Password");

		}
		else if(pwd == 789)
		{
			System.out.println("incorrect password");
		}
	}
}
