package New;

public class A {
	
	protected void show() {
		
		System.out.println("in show method - protected");
	}
	
	public void displayPublic() {
		
		System.out.println("in A class displayPublic");
	}
}
class B extends A{
	
	 public static void main(String args[]) {
		 A a =new A();
		 a.show();
		 System.out.println(" B object calling show() method");
		 B b =new B();
		 b.show();
		 A ab = new B();
		 System.out.println("A object reference n B object");
		 ab.show();
	 }
}