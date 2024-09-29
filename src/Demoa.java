class Shape{
	
	void draw() {
		System.out.println("define the shape type");
	}
}

class Square extends Shape{
	
	@Override
	void draw() {
		System.out.println(" Draw square");
	}
}
class Demoa {

	public static void main(String[] args) {
		
		Shape s = new Square();
		//Square s = new Square();
		s.draw();
	}

}
