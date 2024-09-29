import java.util.Arrays;
import java.util.Scanner;

public class Array_Example {
	
	
	public static void main(String[] args) {
	  int a[] = new int[5];
	  System.out.println("Enter Array elements");
	  Scanner s = new Scanner(System.in);
	  for(int i=0;i<5;i++)
	  {
		  a[i]=s.nextInt();
	  }
	  System.out.println("Sorting array");
	  Arrays.sort(a);
	  for(int b :a) {
		  System.out.println("b "+b);
	  }
	
	}
}
