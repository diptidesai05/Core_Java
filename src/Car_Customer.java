interface vehical{
	
	String name="TVS";
	int speed = 100;
	void start();
	void stop();
	default void color() {
		
		System.out.println("TVS color is red");
	}
	static void speed() {
		
		System.out.println("TVS speed is 100km/h");
	}
}


public class Car_Customer implements vehical {

	@Override
	public void start() {
		
		System.out.println(" Starting the vehical"+name);
	}

	@Override
	public void stop() {
		
		System.out.println(" stopping the vehical");
	}
	
	public static void main(String[] args) {
		Car_Customer c = new Car_Customer();
		c.start();
		c.stop();
		c.color();
		vehical.speed();
		System.out.println("Speed "+speed);
	}

}
