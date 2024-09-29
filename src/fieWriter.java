import java.io.FileWriter;
import java.io.IOException;

class fieWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter f=new FileWriter("E:\\JavaFullCourse\\EarnJava\\test.txt");
			try {
				f.write("Om Vande Deva");
			}
			finally {
				f.close();
			}
			System.out.println("Data wrote in File");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
