import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter number ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		//for loop
		for(int i =1;i<10;i++) {
			
	     	System.out.println(num * i);
		}
		//while loop
        while(num>0)
        {
        	if(num%2==0) {
        		System.out.println(" Even number ");
        		num=0;
        	}else {
        		System.out.println(" Odd number ");
        		num=0;
        	}
        	
        	
        }
        //do-while loop
        do {
        	System.out.println(" num "+num);
        	++num;
        	
        }while(num<=10);
	}

}
