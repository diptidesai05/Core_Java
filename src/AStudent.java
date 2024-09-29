class Student{
	
	int roll, marks;
	String name;
	void input() {
		System.out.println(" enter roll, name, marks");	
	}
}



public class AStudent extends Student {

	void disp() {
		
		roll=1;
		marks=100;
		name="dipti";
		System.out.println("roll "+roll+"marks "+marks+"name "+name);
	}
	public static void main(String[] args) {
	
		AStudent a = new AStudent();
		a.input();
		a.disp();
		
	}

}
