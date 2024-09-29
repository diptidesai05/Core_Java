import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class fileReader {

	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("E:\\JavaFullCourse\\EarnJava\\test.txt");
			try {
				int i;
				while((i=r.read())!=-1){
					System.out.print((char)i);
				}
			}finally {
				
				r.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}


	}

}
