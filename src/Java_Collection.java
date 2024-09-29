import java.util.ArrayList;
import java.util.List;

class Java_Collection {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("1");
		name.add("4");
		name.add("7");
		name.add("8");
		
		System.out.println(name);
		name.add(1,"9");

		System.out.println(name);
	}

}
