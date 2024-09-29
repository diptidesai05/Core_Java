class A{
	
	int a =10;
	
	
	static{
		System.out.println("static block  ");
	}
	A(){
		System.out.println("A constructor  ");
	}
	
	A(int b){
		this();
		System.out.println("A constructor parameter  "+b);
	}
	
	void display() {
		System.out.println(this);
		System.out.println(" A display ");
	}
}

class B extends A{
	
	B(){
		super(12);
		System.out.println("B constructor  ");
	}
	
	
	int a =20;
	
	void show() {
		System.out.println(this);
		System.out.println(" a "+a);
		System.out.println("A class a "+super.a);
	}
	
	void display() {
		super.display();
		System.out.println(" B display ");
		
	}
}

class Test_Super {

	public static void main(String[] args) {
		//B b =new B();
		//b.show();
		//b.display();
		A a = new A(100);
	}

}
