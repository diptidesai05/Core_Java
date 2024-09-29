
public class Second {

	int a = 6; //instance variable
	static double b = 0.5; //static variable 
	
	public static void main(String[] args) {
		Second s = new Second();
		boolean c =  true; //local variable
		System.out.println("c ="+c );
		System.out.println("a ="+s.a );
		System.out.println("b ="+b );
	}

}
