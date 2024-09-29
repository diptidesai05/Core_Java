package New1;
import New.A;

/*class C extends A {

	
	  public static void main(String[] args) {
	  
	  System.out.println("C class object calling A class's show method"); C c = new
	  C(); c.show();
	  
	  }
	 
}*/

class C{
	
     public static void main(String[] args) {
		
		System.out.println("D class object calling A class's show method");
		A a = new A();
		a.displayPublic();
		System.out.println(a);
		
	
	}
}
