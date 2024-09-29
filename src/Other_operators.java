
public class Other_operators {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(" post increment " + a++); // 10
		System.out.println(" pre increment " + ++a); // 12
		System.out.println(" post decrement " + a--); // 12
		System.out.println(" pre decrement " + --a); // 10
		a+=10;
		System.out.println(" a "+a);
		a-=10;
		System.out.println(" a "+a);
		a*=10;
		System.out.println(" a "+a);
		a/=10;
		System.out.println(" a "+a);
		a%=10;
		System.out.println(" a "+a);
		
		int d = 10, b=5, c=9 ;
	    int r = (d>b)? (d>c? d :c) : (b>c ? b: c);
        System.out.println("r "+r);		
		
		
		
		

	}

}

