import java.io.File;
import java.io.IOException;

class createFile {

	public static void main(String[] args) throws IOException {
		
		File f =new File("E:\\JavaFullCourse\\EarnJava\\test.txt");
		if(f.createNewFile()) {
			
			System.out.println("File created");
			
		}else {
			System.out.println("File already created");
		}

	}

}
