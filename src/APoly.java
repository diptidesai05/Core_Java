
public class APoly {

	void add() {
		System.out.println("in no-parameter add method");
	}
	
	void add(int x) {
		
		System.out.println(" with single parameter" );
	}
    void add(int x, int y) {
		
		System.out.println(" with double parameters" );
	}
	
	public static void main(String[] args) {
		
		APoly apoly = new APoly();
		apoly.add();
		apoly.add(8);
		apoly.add(8,9); 

	}

}
