
public class Person {

	int age = 8;
	String name ="Dipti";
	
	/*private Person() {
		age = 10;
		name="Desai";
		
	}*/
	 Person(){
		age = 10;
		name="Desai";
	}
	
	Person(int age1, String name1){
		age=age1;
		name=name1;
	}
	
	
	void sleep() {
		
		System.out.println("Sleeping");
	}
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println("p.Age =" +p.age);
		System.out.println("p.Name = "+p.name);
		p.sleep();
		Person p1 = new Person(90,"Dela");
		System.out.println("p1.Age =" +p1.age);
		System.out.println("p1.Name = "+p1.name);
	
	}

}
class Test{
	
	static void show() {
		Person p = new Person();
		System.out.println("in show");
		System.out.println("p.Age =" +p.age);
		System.out.println("p.Name = "+p.name);
	}
	
	public static void main(String[] args) {
		show();
	}
}

